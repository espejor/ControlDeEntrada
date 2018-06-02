package data;

import interfaces.IData;
import persona.Persona;

public class DataIdCard implements IData {
    private Persona titular;
    private int numberCard;
    private String pin = "0000";

    public DataIdCard(Persona titular, int numberCard) {
        this(titular);
        this.numberCard = numberCard;
    }

    public DataIdCard(Persona titular) {
        this.titular = titular;
    }

    /**
     * Setter de numberCard
     * @param numberCard del tipo int
     */
    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    /**
     * Getter de titular
     *
     * @return titular
     */
    public Persona getTitular() {
        return titular;
    }

    /**
     * Getter de numberCard
     *
     * @return numberCard
     */
    public int getNumberCard() {
        return numberCard;
    }

    /**
     * Getter de pin
     *
     * @return pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * Setter de pin
     *
     * @param pin del tipo java.lang.String
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    public boolean checkPin(String pin){
            return getPin().equals(pin);
    }
}
