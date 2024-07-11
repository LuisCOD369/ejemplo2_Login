package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.product;
import view.view_product;
import model.productDAO;

public class logic_view_product implements Parametz, ActionListener{
	private view_product vp;

	public logic_view_product(view_product vp) {
		super();
		this.vp = vp;
		title(vp);
		this.vp.btn_add.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vp.btn_add) {
			product.setNameProduct(vp.txt_nombreProducto.getText());
			product.setDescription(vp.text_areaDescripcion.getText());
			product.setStock(Integer.parseInt(vp.sp_stock.getValue().toString()));
			product.setPrice(Double.parseDouble(vp.txt_price.getText()));
			pdo.setProduct(product);
			if(pdo.creadProduct(1)) {
				JOptionPane.showMessageDialog(vp, "Registro de producto");
			}
			
		}
	}
	

}
