package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.User;
import model.UserDAO;
import view.Login;
import view.view_catalogo;
import view.view_product;

public class logic_view_login implements ActionListener, Parametz
{
	private Login vl;
	private boolean flag = false;
	
	public logic_view_login (Login vl) 
	{
		super ();
		this.vl = vl;
		
		this.vl.btn_ok.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			// Obtener los datos de los usuarios
			user.setEmail(vl.txt_email.getText());
			user.setPsw(getWord(vl.pwf_psw.getPassword()));
			// Obtiene los datos de la bbdd
			List <User> users = udao.loadUsers();
			// Validar los campos
			for (User u : users)
			{
				if (u.getEmail().equals(user.getEmail()) && u.getPsw().equals(user.getPsw()))
				{
					flag = true;
					user.setId(u.getId());
					user.setRoll(u.getRoll());
					
				}
			}
			// Accion correspondiente
			accessSession();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(vl, "Error al cargar los usuarios");
		}
	}

	private void accessSession() 
	{
		// TODO Auto-generated method stub
		if (flag)
		{
			JOptionPane.showMessageDialog(vl, "Bienenido: " + user.getEmail());
			registerLog("Acceso correcto");
			try {
				session.writeFile(user.getEmail()+";"+user.getRoll()+";", true);
				switch(user.getRoll()) {
				case 1:
					view_product vp=new view_product();
					vp.setVisible(true);
					break;
				case 2:
					view_catalogo vc=new view_catalogo();
					vc.setVisible(true);
					break;
				}
				vl.setVisible(false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		else
		{
			JOptionPane.showMessageDialog(vl, "Credenciales Incorrectas");
			registerLog("Acceso incorrecto");
		}
	}
}
