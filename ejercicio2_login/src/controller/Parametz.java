package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;

import libreriaVersion3.Files;
import model.User;
import model.UserDAO;
import model.productDAO;
import model.product;

public interface Parametz 
{
	public final UserDAO udao = new UserDAO ();
	
	public final User user = new User ();
	
	public final Files log = new Files ("src/data/log.txt"), //almacenar los logeos del programa
						session = new Files ("src/data/session.txt"); //Almacenar el usuario logead
	public final productDAO pdo=new productDAO(); //permite acceder al dao de producto
	public final product product= new product();
	
	
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
	//este metodo permite cargar el nombre del usuario que accedio al sistema
	public default void title(JFrame frame) {
		String [] dataUser = session.readerFile().split(";");
		user.setEmail(dataUser[0]);
		user.setRoll(Integer.parseInt(dataUser[1]));
		String perfil=switch(user.getRoll()) {
		case 1 -> "Vendedor";
		case 2 -> "Cliente";
		default -> "Anonimo";
		};
		frame.setTitle(String.format("USER: %s ROLL: %s", user.getEmail(), perfil));
	}
	public default List<product> loadProducts(){
		List<product> products=new ArrayList();
		try {
			products=pdo.loadAllProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
}

	

