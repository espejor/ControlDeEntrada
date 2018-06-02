package main;

import controllers.Controller;
import inputs.objectsToReader.ObjectToReader;
import interfaces.IController;
import model.Authorised;
import persona.Persona;

import java.util.ArrayList;

public class EnterControl {
    final ArrayList<IController> controllers = new ArrayList<IController>();

    public void addController(IController controller){
        if (!controllers.contains(controller))
            controllers.add(controller);
    }

    public Authorised addAuthorised(Persona persona, ObjectToReader objectToReader){
        Authorised authorised01= new Authorised(persona,objectToReader);
        if (!Controller.authorised.exist(authorised01)){
            Controller.authorised.add(authorised01);
            return authorised01;
        }
        return null;
    }
}
