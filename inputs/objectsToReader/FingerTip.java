package inputs.objectsToReader;

import data.DataFingerPrint;
import interfaces.IObjectToReader;
import persona.Persona;

public class FingerTip extends ObjectToReader{
    public FingerTip(Persona titular, String data){ // Titular del dedo y estructura de los datos del dedo
        super(titular);
        this.data.setData(new DataFingerPrint(data));
    }

}
