package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements Settings
{
	private User user;
	
	public UserDAO(User user) {
		super();
		this.user = user;
	}
	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean updateUser (int option)
	{
		/*
		 * Opcion = 1	INSERT
		 * Opcion = 2	UPDATE
		 * Opcion = 3	DELETE
		 * */
		boolean estate = switch (option)
		{
		case 1 -> conn.setQuery(String.format("INSERT INTO empresa.user VALUES (null, '%s', '%s', %d)", user.getEmail(), user.getPsw(), user.getRoll()));
		case 2 -> conn.setQuery("");
		case 3 -> conn.setQuery("");
		
		default -> false;
		};
		return estate;
	}
	
	public List <User> loadUsers () throws SQLException
	{
		List <User> users = new ArrayList ();
		
		ResultSet res = conn.getQuery("SELECT * FROM empresa.user");
		while (res.next())
		{
			users.add(new User (res.getInt(1), res.getString(2), res.getString(3), res.getInt(4)));
		}
		
		conn.closeConn();
		return users;
	}
}
