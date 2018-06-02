package inputs.objectsToReader;

import data.Data;
import data.DataIdCard;
import interfaces.IObjectToReader;
import persona.Persona;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:47
 */
public class IdCard extends ObjectToReader {

    public IdCard(Persona titular) {
        super(titular);
        data.setData(new DataIdCard(titular,createNumber(titular.getDni().getNumero())));
    }


    private int createNumber(int dni){
        return 9000 + dni * 100000000 ;
    }


    /**
     * Getter de numberCard
     *
     * @return numberCard
     */
    public int getNumberCard() {
        return ((DataIdCard)data.getData()).getNumberCard();
    }

    /**
     * Getter de pin
     *
     * @return pin
     */
    public String getPin() {
        return ((DataIdCard)data.getData()).getPin();
    }

    public void setPin(String pin){
        ((DataIdCard)data.getData()).setPin(pin);
    }


    public void changePin(String newPin){
        this.setPin(newPin);
    }
}