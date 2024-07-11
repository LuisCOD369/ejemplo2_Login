package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productDAO implements Settings{

	private product product;

	public productDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public productDAO(model.product product) {
		super();
		this.product = product;
	}
	/**
	 * Metodo para realizar el CRUD de un producto
	 * values operation
		 * 1 -> Insert
		 * 2 -> Select
		 * 3 -> Update
		 * 4 -> Delete
	 * @param operation
	 * @return
	 */
	public boolean creadProduct(int operation) {
		boolean value =switch (operation) {
		case 1 ->conn.setQuery(
				String.format("INSERT INTO empresa.product VALUES(null, '%s','%s',%d,%s);", 
						product.getNameProduct(), 
						product.getDescription(), 
						product.getStock(), 
						String.valueOf(product.getPrice()))
				);
		case 2 ->conn.setQuery("");
		case 3 ->conn.setQuery("");
		case 4 ->conn.setQuery("");
		default -> false;
		
		
		};
		return value;

	}
	public void setProduct(product p) {
		this.product=p;
	}
	public List<product>loadAllProduct() throws SQLException{
		List<product>products=new ArrayList();
		ResultSet res=conn.getQuery("SELECT * FROM empresa.product;");
		while(res.next()) {
			product.setId(res.getInt(1));//hace referencia al id del producto
			product.setNameProduct(res.getString(2));// hace referencia al nombre del prodcuto
			product.setDescription(res.getString(3));//hace referencia a la descripcion del producto
			product.setStock(res.getInt(4));//hace referencia al stock del producto
			product.setPrice(Double.parseDouble(res.getString(5)));//hace referencia al precio del producto
			products.add(product);//Carga cada producto en la list
		}
		conn.closeConn();
		return products;
		
	}
	
	

}
