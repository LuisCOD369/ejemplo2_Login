package view;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.logic_view_catalogo;

import javax.swing.JButton;
import java.awt.Color;

public class view_catalogo extends JFrame{
	public JButton bnt_prev;
	public JButton bnt_next;
	public JLabel lbl_stock;
	public JLabel lbl_price;
	public JLabel lbl_des;
	public JLabel lbl_newProduct;
	public JLabel lbl_Img;
	public view_catalogo() {
		getContentPane().setBackground(new Color(153, 255, 204));
		setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				Login vl=new Login();
				vl.setVisible(true);
				vl.setLocationRelativeTo(null);
			}
		});
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 100, 329, 429);
		getContentPane().setLayout(null);
		
		
		lbl_Img = new JLabel("Imagen");
		lbl_Img.setBounds(10, 11, 262, 225);
		getContentPane().add(lbl_Img);
		
		lbl_newProduct = new JLabel("Producto");
		lbl_newProduct.setFont(new Font("Constantia", Font.PLAIN, 14));
		lbl_newProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_newProduct.setBounds(10, 247, 262, 23);
		getContentPane().add(lbl_newProduct);
		
		lbl_des = new JLabel("Descripcion");
		lbl_des.setFont(new Font("Constantia", Font.PLAIN, 14));
		lbl_des.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_des.setBounds(10, 281, 262, 23);
		getContentPane().add(lbl_des);
		
		lbl_stock = new JLabel("Stock");
		lbl_stock.setFont(new Font("Constantia", Font.PLAIN, 14));
		lbl_stock.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_stock.setBounds(10, 315, 125, 23);
		getContentPane().add(lbl_stock);
		
		lbl_price = new JLabel("Precio");
		lbl_price.setFont(new Font("Constantia", Font.PLAIN, 14));
		lbl_price.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price.setBounds(147, 315, 125, 23);
		getContentPane().add(lbl_price);
		
		bnt_prev = new JButton("<<");
		bnt_prev.setBackground(new Color(153, 255, 255));
		bnt_prev.setBounds(46, 358, 89, 23);
		getContentPane().add(bnt_prev);
		
		bnt_next = new JButton(">>");
		bnt_next.setBackground(new Color(153, 255, 255));
		bnt_next.setBounds(157, 358, 89, 23);
		getContentPane().add(bnt_next);
		
		new logic_view_catalogo(this);
	}
}
