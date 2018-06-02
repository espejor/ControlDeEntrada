package inputs;

import interfaces.IController;
import interfaces.IReader;

public abstract class Reader implements IReader {
    protected IController listener;

    public Reader() {}

    @Override
    public void addListener(IController controller) {
        if (listener == null)
            listener =  controller;
    }
}
