package outputs;

import interfaces.IDoor;
import interfaces.IReader;
import interfaces.State;

public class Door implements IDoor, State {
    IReader reader;
    private int state = LOCK;


    public Door() {

    }


    @Override
    public void passThrougt() {

    }

    @Override
    public void lockDoor() {
        state = LOCK;
    }

    @Override
    public void unLockDoor() {
        state = UNLOCK;
    }
}
