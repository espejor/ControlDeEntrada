package interfaces;

public interface IDoor {
    default void passThrougt(){
        lockDoor();
    }
    void lockDoor();
    void unLockDoor();
}
