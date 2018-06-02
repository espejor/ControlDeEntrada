package interfaces;

import persona.Persona;

public interface IController {
    boolean exist(Persona p);

    /**
     * Comprueba que la Persona con data de entrada  se encuentra en la lista de Authorised
     * @return true si se encuentra y false en otro caso
     */
    boolean checkAuthorised(Persona titular);
    void insert (Persona p);
    void lock();
    void unLock();
}
