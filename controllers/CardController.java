package controllers;

import data.DataIdCard;
import inputs.card.CardReader;
import inputs.objectsToReader.IdCard;
import interfaces.IDoor;
import persona.Persona;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:46
 */
public class CardController extends Controller {
    private DataIdCard dataIdCard;

	public CardController(IDoor door, CardReader reader){
		super(door, reader);
	}

    private boolean checkPin(String pin){
	    return dataIdCard.checkPin(pin);
    }

	private DataIdCard readingCard(IdCard idCard){
        return ((CardReader)reader).readCard(idCard);
    }


    public void onInsertCard(IdCard idCard){
        CardReader rdr = ((CardReader)reader);
        // Obtener los datos de la tarjeta
        dataIdCard = readingCard(idCard);
        Persona auth = dataIdCard.getTitular();
        int i = 0;
        boolean checkPin = false;
        do {
            // Obtener el PIN
            String pin = rdr.getPin();
            i++;
            checkPin = checkPin(pin);
        }while (!checkPin && i < 3 ); // Comprobar si concuerdan los datos
        if (checkPin) {
            rdr.printInDisplay("Pin correcto");
            if (checkAuthorised(auth)) {
                rdr.printInDisplay("Paso autorizado");
                unLock();
            }
            else {
                lock();
                rdr.printInDisplay("No está autorizado a pasar. Diríjase al control de entradas manual");
            }
        }else
            rdr.printInDisplay("Su pin no es correcto. diríjase al control de entradas manual");
    }


    public void onChangingPIN(IdCard idCard) {
        CardReader rdr = ((CardReader)reader);
        rdr.printInDisplay("Introduzca nuevo PIN");
        String newPin1 = rdr.readFromKeyboard();
        rdr.printInDisplay("Vuelva a introducir el PIN");
        String newPin2 = rdr.readFromKeyboard();
        if (newPin1.equals(newPin2)){
            idCard.setPin(newPin1);
            rdr.printInDisplay("Su nuevo pin es: " + newPin1);
        }else {
            rdr.printInDisplay("Error al cambiar el pin");
        }
    }
}