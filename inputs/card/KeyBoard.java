package inputs.card;

import java.util.Scanner;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:47
 */
public class KeyBoard {

    public KeyBoard(){
    }


	public String read(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca PIN (tiene tres intentos)");
        return teclado.nextLine();
    }

    private boolean check(String numberRead){
	    int i = Integer.valueOf(numberRead);
        return i >= 0 && i < 10000;
    }
}