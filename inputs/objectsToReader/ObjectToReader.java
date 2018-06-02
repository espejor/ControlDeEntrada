package inputs.objectsToReader;

import data.Data;
import interfaces.IData;
import interfaces.IObjectToReader;
import persona.Persona;

public class ObjectToReader implements IObjectToReader {
    protected Data data;

    public ObjectToReader(Persona titular) {
        data = new Data(titular);
    }

    public ObjectToReader(Persona titular, IData iData) {
        this(titular);
        this.data.setData(iData);
    }

    /**
     * Getter de data
     * @return data
     */
    public Data getData() {
        return data;
    }

    public Persona getTitular(){
        return data.getTitular();
    }

    public IData getIData(){
        return data.getData();
    }
}
