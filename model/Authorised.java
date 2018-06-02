package model;

import inputs.objectsToReader.ObjectToReader;
import interfaces.IData;
import persona.Dni;
import persona.Persona;

public class Authorised extends Persona {
    private ListData listData = new ListData();

    public Authorised(Persona persona,ObjectToReader objectToReader){
        this(persona.getDni(),persona.getName(),persona.getApellido1(),persona.getApellido2(),objectToReader);
    }

    public Authorised(Dni dni, String name, String apellido1, String apellido2,ObjectToReader objectToReader) {
        super(dni, name, apellido1, apellido2);
        addData(objectToReader);
    }

    public Authorised(int dni, String name, String apellido1, String apellido2,ObjectToReader objectToReader) {
        this(new Dni(dni), name, apellido1, apellido2,objectToReader);
    }

    /**
     * Getter de listData
     *
     * @return listData
     */
    public ListData getListData() {
        return listData;
    }

    public void addData(ObjectToReader objectToReader) {
        IData iData = objectToReader.getIData();
        listData.add(iData);
    }

    public boolean hasData(IData iData){
        return listData.contains(iData);
    }
}


