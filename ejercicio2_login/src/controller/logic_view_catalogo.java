package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import view.view_catalogo;
import model.product;

public class logic_view_catalogo implements ActionListener, Parametz {
	private view_catalogo vc;
	private int index=0;
	
	
	
	public logic_view_catalogo(view_catalogo vc) {
		super();
		this.vc = vc;
		this.vc.bnt_next.addActionListener(this);
		this.vc.bnt_prev.addActionListener(this);
		processStock hilo=new processStock();
		hilo.start();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vc.bnt_next) {
			index++;
		}else if(e.getSource()==vc.bnt_prev){
			index--;
		}
		loadProduct();
	}
	private void loadProduct() {
		if(index>=0 && index<loadProducts().size()) {
			product p=loadProducts().get(index);
			vc.lbl_newProduct.setText(p.getNameProduct());
			vc.lbl_des.setText(p.getDescription());
			vc.lbl_stock.setText("Stock: "+String.valueOf(p.getStock()));
			vc.lbl_price.setText("Precio: $"+String.valueOf(p.getPrice()));
			
		}
	}
	
	

}
