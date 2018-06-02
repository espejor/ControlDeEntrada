package inputs.fingerprint;

import controllers.CardController;
import controllers.FingerprintController;
import inputs.Reader;
import inputs.objectsToReader.FingerTip;
import inputs.objectsToReader.IdCard;
import interfaces.IDoor;
import interfaces.IObjectToReader;
import interfaces.IReader;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:47
 */
public class FingerPrintReader extends Reader {

	public FingerPrintReader() {
		super();
	}

	/**
	 * Lee los datos con el dispositivo lector
	 *
	 * @param fingerTip
	 * @return Datos leídos que implementan la interfaz IData
	 */
	@Override
	public void reading(IObjectToReader fingerTip) {
        ((FingerprintController)listener).onPassFingerTip((FingerTip) fingerTip);
    }
}