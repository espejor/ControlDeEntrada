package interfaces;

/**
 * @author Jos�
 * @version 1.0
 * @created 06-feb.-2018 12:55:47
 */
public interface IReader {

    /**
     * Lee los datos con el dispositivo lector
     * @return Datos le�dos que implementan la interfaz IData
     */
    void reading(IObjectToReader objectToReader);
    void addListener(IController iController);

}