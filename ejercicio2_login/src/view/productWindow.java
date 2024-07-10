package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class productWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nombreProducto;
	private JTextField txt_price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					productWindow frame = new productWindow();
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
	public productWindow() {
		setTitle("Agregar producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Producto:");
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel.setBounds(26, 20, 76, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescripcionDelProducto = new JLabel("Descripcion del producto:");
		lblDescripcionDelProducto.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblDescripcionDelProducto.setBounds(26, 73, 175, 26);
		contentPane.add(lblDescripcionDelProducto);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblPrecio.setBounds(138, 301, 63, 26);
		contentPane.add(lblPrecio);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblStock.setBounds(138, 333, 46, 26);
		contentPane.add(lblStock);
		
		txt_nombreProducto = new JTextField();
		txt_nombreProducto.setForeground(new Color(0, 102, 255));
		txt_nombreProducto.setFont(new Font("Constantia", Font.PLAIN, 14));
		txt_nombreProducto.setBounds(105, 17, 216, 26);
		contentPane.add(txt_nombreProducto);
		txt_nombreProducto.setColumns(10);
		
		txt_price = new JTextField();
		txt_price.setForeground(new Color(0, 102, 255));
		txt_price.setFont(new Font("Constantia", Font.PLAIN, 14));
		txt_price.setColumns(10);
		txt_price.setBounds(215, 298, 106, 26);
		contentPane.add(txt_price);
		
		JSpinner sp_stock = new JSpinner();
		sp_stock.setForeground(new Color(0, 102, 255));
		sp_stock.setFont(new Font("Constantia", Font.PLAIN, 14));
		sp_stock.setBounds(215, 329, 63, 27);
		contentPane.add(sp_stock);
		
		JButton btn_add = new JButton("Agregar");
		btn_add.setBackground(new Color(102, 255, 102));
		btn_add.setFont(new Font("Constantia", Font.PLAIN, 14));
		btn_add.setBounds(225, 366, 96, 26);
		contentPane.add(btn_add);
		
		JTextArea text_areaDescripcion = new JTextArea();
		text_areaDescripcion.setLineWrap(true);
		text_areaDescripcion.setForeground(new Color(0, 102, 255));
		text_areaDescripcion.setFont(new Font("Constantia", Font.PLAIN, 14));
		text_areaDescripcion.setBounds(26, 109, 295, 164);
		contentPane.add(text_areaDescripcion);
	}
}
