package controllers;


import interfaces.IDoor;
import interfaces.IReader;
import persona.Persona;

/**
 * @author José
 * @version 1.0
 * @created 06-feb.-2018 12:55:46
 */
public class IrisController extends Controller {

	public IrisController(IDoor door, IReader reader) {
		super(door, reader);
	}


}