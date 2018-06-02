package inputs.iris;

import inputs.Reader;
import interfaces.IDoor;
import interfaces.IObjectToReader;
import interfaces.IReader;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:47
 */
public class IrisReader extends Reader {

	public IrisReader() {
		super();
	}

	/**
	 * Lee los datos con el dispositivo lector
	 *
	 * @param objectToReader
	 * @return Datos leídos que implementan la interfaz IData
	 */
	@Override
	public void reading(IObjectToReader objectToReader) {

	}
}