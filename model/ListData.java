package model;

import interfaces.IData;

import java.util.ArrayList;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:46
 */
public class ListData {
    private final ArrayList<IData> listIData = new ArrayList<IData>();

    public ListData(IData data) {
        add(data);
    }

    public ListData() {

    }

    public void add(IData data){
        if(!listIData.contains(data))
            listIData.add(data);
    }

    public boolean contains(IData data){
        return listIData.contains(data);
    }

}