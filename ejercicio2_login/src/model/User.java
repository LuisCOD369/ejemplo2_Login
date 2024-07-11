package model;

import libreriaVersion3.Generica;

public class User 
{
	private Generica <String, Integer> dt_u;
	public User ()
	{
		super();
		dt_u = new Generica <>();
	}
	
	public User (int id, String email, String psw, int roll)
	{
		dt_u = new Generica <> (email, psw, roll, id);
		
	}
	
	public String getEmail ()
	{
		return this.dt_u.getAttribute1();
	}
	public void setEmail (String email)
	{
		this.dt_u.setAttribute1(email);
	}
	public String getPsw ()
	{
		return this.dt_u.getAttribute2();
	}
	public void setPsw (String psw)
	{
		this.dt_u.setAttribute2(psw);
	}
	public int getRoll ()
	{
		return this.dt_u.getAttribute3();
	}
	public void setRoll (int roll)
	{
		this.dt_u.setAttribute3(roll);
	}
	public int getId ()
	{
		return this.dt_u.getAttribute4();
	}
	public void setId (int id)
	{
		this.dt_u.setAttribute4(id);
	}
}
