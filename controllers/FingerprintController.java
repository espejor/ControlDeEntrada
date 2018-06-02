package controllers;

import data.DataFingerPrint;
import inputs.objectsToReader.FingerTip;
import interfaces.IDoor;
import interfaces.IReader;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:46
 */
public class FingerprintController extends Controller {

	public FingerprintController(IDoor door, IReader reader){
		super(door, reader);
	}

	public void onPassFingerTip(FingerTip fingerTip){
		if (checkData((DataFingerPrint)fingerTip.getIData()))
		    grantPassage();
	}

	private void grantPassage(){
	    unLock();
    }

    private boolean checkData(DataFingerPrint dataFingerPrint){
		return true;
    }
}