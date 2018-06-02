package controllers;

import interfaces.IController;
import interfaces.IData;
import interfaces.IDoor;
import interfaces.IReader;
import model.Authorised;
import model.ListAuthorised;
import persona.Persona;

public abstract class Controller implements IController {
    public static final ListAuthorised authorised = new ListAuthorised();
    private final IDoor door;
    protected final IReader reader;

    //----------- Constructor -------------
    public Controller(IDoor door, IReader reader) {
        this.door = door;
        this.reader = reader;
        this.reader.addListener(this);
    }

    //------------ Gestión de personas autorizadas ----------

    @Override
    public boolean exist(Persona p) {
        return authorised.exist(p);
    }

    /**
     * Comprueba que la Persona con data de entrada  se encuentra en la lsta de Authorised
     * @param titular
     * @return true si se encuentra y false en otro caso
     */
    @Override
    public boolean checkAuthorised(Persona titular) {
        return authorised.exist(titular);
    }

    @Override
    public void insert(Persona p) {
        if (!authorised.exist((Authorised)p))
            authorised.add((Authorised)p);
    }

    // ----------- Bloqueo y desbloqueo de la puerta ------------

    @Override
    public void lock() {
        door.lockDoor();
    }

    @Override
    public void unLock() {
        door.unLockDoor();
    }

    /**
     * Getter de door
     *
     * @return door
     */
    public IDoor getDoor() {
        return door;
    }

    /**
     * Getter de reader
     *
     * @return reader
     */
    public IReader getReader() {
        return reader;
    }

    public Authorised authorisedHasData(IData iData){
        return null;
    }


}
