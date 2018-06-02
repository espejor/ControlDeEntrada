package inputs.card;

import controllers.CardController;
import data.DataIdCard;
import inputs.Reader;
import inputs.objectsToReader.IdCard;
import interfaces.IObjectToReader;

import java.util.Scanner;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:46
 */
public class CardReader extends Reader {

	//private IdCard idCard;
	private final KeyBoard keyBoard;
	private final DisplayCardReader display = new DisplayCardReader();

	public CardReader(){
		super();
		keyBoard = new KeyBoard();
	}


    /**
     * Lee una tarjeta de identificación y devuelve su número de tarjeta
     * @return Número de tarjeta de id
     */
    public DataIdCard readCard(IdCard idCard){
        //greetingMessage(idCard);
        return (DataIdCard)idCard.getData().getData();
	}

	public String getPin (){
        return keyBoard.read();
    }

    private void greetingMessage(IdCard idCard){
        String name = idCard.getTitular().getName();
        String ape1 = idCard.getTitular().getApellido1();
        String ape2 = idCard.getTitular().getApellido2();
        display.print("Leyendo tarjeta de identidad..............");
        display.print("Bienvenido. " + name + " " + ape1 + " " + ape2);
    }

    private void farewellMessage(){
        display.print("Extraiga tarjeta de identidad");
    }

    public void printInDisplay(String msg){
        display.print(msg);
    }

    public String readFromKeyboard(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Lee los datos con el dispositivo lector
     */
    @Override
    public void reading(IObjectToReader idCard) {
        greetingMessage((IdCard) idCard);
        ((CardController)listener).onInsertCard((IdCard) idCard);
        farewellMessage();
    }

    public void changePin(IObjectToReader idCard){
        greetingMessage((IdCard) idCard);
        ((CardController)listener).onChangingPIN((IdCard) idCard);
        farewellMessage();
    }


}