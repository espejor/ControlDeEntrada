package data;

import interfaces.IData;
import persona.Persona;

public class Data{
    protected final Persona titular;
    private IData data;

    // ---------- Constructores ---------
    public Data(Persona titular) {
        this.titular = titular;
    }

    public Data(Persona titular, IData data) {
        this.titular = titular;
        this.data = data;
    }

    // ---------------


    /**
     * Getter de data
     * @return data
     */
    public IData getData() {
        return data;
    }

    /**
     * Setter de data
     * @param data del tipo interfaces.IData
     */
    public void setData(IData data) {
        this.data = data;
    }

    /**
     * Getter de titular
     * @return titular
     */
    public Persona getTitular() {
        return titular;
    }
}
