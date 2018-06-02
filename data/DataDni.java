package data;

import interfaces.IData;
import persona.Dni;

public class DataDni extends Dni implements IData {
    public DataDni(int n) {
        super(n);
    }

    public DataDni(String dni) {
        super(dni);
    }
}
