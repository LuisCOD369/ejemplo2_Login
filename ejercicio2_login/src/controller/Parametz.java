package controller;

import java.io.IOException;
import java.util.Date;

import libreriaVersion3.Files;
import model.User;
import model.UserDAO;

public interface Parametz 
{
	public final UserDAO udao = new UserDAO ();
	
	public final User user = new User ();
	
	public final Files log = new Files ("src/data/log.txt"), //almacenar los logeos del programa
						session = new Files ("src/data/session.txt"); //Almacenar el usuario logead
	// Permite construir una cadena de caracteres
	public default String getWord (char [] c)
	{
		String word = "";
		for (char cr : c)
		{
			word += String.valueOf(cr);
		}
		return word; 
	}
	
	public default void registerLog(String msg) {
		try {
		log.writeFile("User: " + user.getEmail() + " Action: " + msg +"Date: " + new Date(), false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
