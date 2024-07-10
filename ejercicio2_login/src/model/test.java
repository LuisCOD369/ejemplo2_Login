package model;

import java.sql.SQLException;
import java.util.List;

public class test 
{
	public static void main (String [] args)
	{
//		UserDAO udao = new UserDAO (new User("liamfabian@gmail.com", "TenseMepitH1324", 1));
//		
//		if (udao.updateUser(1))
//		{
//			System.out.println("Dato registrado");
//		}
		
//		UserDAO udao = new UserDAO ();
//		
//		try {
//			List <User> users = udao.loadUsers();
//			
//			for (User u : users)
//			{
//				System.out.println(u.getEmail() + "\t" + u.getPsw());
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		productDAO pdao=new productDAO(new product(1, "Monitor 16", 4, 125.50));
		if(pdao.creadProduct(1)) {
			System.out.println("Producto Registrado :)");
		}
		
	}
}