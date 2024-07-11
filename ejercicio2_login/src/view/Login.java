package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.logic_view_login;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txt_email;
	public JPasswordField pwf_psw;
	public JButton btn_ok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login");
		setResizable(false);
		setBounds(100, 100, 367, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 438, 254);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(25, 26, 102, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(25, 63, 102, 14);
		panel.add(lblNewLabel_1);
		
		txt_email = new JTextField();
		txt_email.setBounds(137, 23, 179, 20);
		panel.add(txt_email);
		txt_email.setColumns(10);
		
		pwf_psw = new JPasswordField();
		pwf_psw.setBounds(137, 60, 179, 20);
		panel.add(pwf_psw);
		
		btn_ok = new JButton("OK");
		btn_ok.setBounds(229, 106, 89, 23);
		panel.add(btn_ok);
		
		logic_view_login vl = new logic_view_login(this);
		
	}
}
