package data;

import interfaces.IData;
import persona.Persona;

public class DataFingerPrint implements IData {
    private String data ;

    public DataFingerPrint(String dfp) {
        data = dfp;
    }

    /**
     * Setter de data
     * @param data del tipo java.lang.String
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Getter de data
     * @return data
     */
    public String getData() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        //Reflexivo
        if ( this == obj ) return true;

        //No nulo
        if ( obj == null ) return false;

        //Simetrico
        //La máquina virtual mantiene una única instancia de cada clase, por lo que esta comparación es correcta
        //Usar instanceof no garantiza la simetría porque es true para una clase y sus hijos
        if ( this.getClass() != obj.getClass() ) return false;

        // una vez que sabemos que son del mismo tipo hacemos cast para que el compilador lo sepa también
        if ( this.data == this.getClass().cast(obj).getData() ) return true;

        if ( this.data != null )
            return this.data.equals( this.getClass().cast(obj).getData());
        return false;
    }
}
