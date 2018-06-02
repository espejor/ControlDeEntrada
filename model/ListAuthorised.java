package model;

import persona.Persona;
import tad.arbol.ArbolAVL;

public class ListAuthorised {
    private final ArbolAVL<Persona> arbolAVL = new ArbolAVL<Persona>();

    public void add(Authorised p){
        arbolAVL.insert(p);
    }


    public boolean exist(Persona p){
        return arbolAVL.find(p);
    }

    public ListData getDataOfAuthorised(Authorised persona){
        if (exist(persona))
            return persona.getListData();
        return null;
    }

    public Authorised lookFor(){
        return null;
    }
}
