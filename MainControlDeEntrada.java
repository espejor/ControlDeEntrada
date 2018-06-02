import controllers.CardController;
import controllers.FingerprintController;
import inputs.card.CardReader;
import inputs.fingerprint.FingerPrintReader;
import inputs.objectsToReader.FingerTip;
import inputs.objectsToReader.IdCard;
import inputs.objectsToReader.ObjectToReader;
import interfaces.IController;
import interfaces.IDoor;
import interfaces.IReader;
import main.EnterControl;
import model.Authorised;
import outputs.DoorHandicaper;
import outputs.Torno;
import persona.Persona;

public class MainControlDeEntrada
{
    public static void main(String args[]) {
        // --------- Creación de las puertas y lectores e inclusión en los controladores
        IDoor torno = new Torno();
        IReader cardReader = new CardReader();
        IController controlCard = new CardController(torno, (CardReader) cardReader);

        IDoor doorHandicaped = new DoorHandicaper();
        IReader fingerPrintReader = new FingerPrintReader();
        IController controlFingerPrint = new FingerprintController(doorHandicaped,fingerPrintReader);
        // ---------------------------------------------

        // ----------- Creación del Control de Entrada e inclusión de De los controladores
        EnterControl enterControl = new EnterControl();
        enterControl.addController(controlCard);
        enterControl.addController(controlFingerPrint);
        // ---------------------------------------------


        //----------- Crear Personas
        Persona persona = new Persona(12345678,"Paco","García","Pérez");
        Persona persona2 = new Persona(98765432,"Pepe","López","Martínez");
        // ---------- Crear su idCard
        ObjectToReader idCard = new IdCard(persona);
        // ---------- Crear su FingerTip (darle un código)
        ObjectToReader fingerTip = new FingerTip(persona,"00147258369QPALAL");
        // ----------- Autorizar a las Personas
        Authorised authorised01 = enterControl.addAuthorised(persona,idCard);
        authorised01.addData(fingerTip);

        ((CardReader) cardReader).changePin(idCard);

        // -------------- Crear una IdCard sin autorizar al propietario
        IdCard idCard2 = new IdCard(persona2);


        // ---------- Paso por control de entrada
        fingerPrintReader.reading(fingerTip);
        cardReader.reading(idCard2);


    }
}
