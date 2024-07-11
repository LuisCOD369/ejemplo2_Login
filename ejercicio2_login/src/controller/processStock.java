package controller;
import javax.swing.JOptionPane;

import model.product;

public class processStock extends Thread implements Parametz{
	public void run() {
		while(true) {
			try {
				sleep(3000);
				
				//cada 3 segundos va a encargarse de tomar la List, analiza y me vuelve a cargar
				for(product p:loadProducts()) {
					if(p.getStock()<=0) {
						JOptionPane.showMessageDialog(null, "Producto: "+p.getNameProduct()+" Esta agotado");
					}
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
