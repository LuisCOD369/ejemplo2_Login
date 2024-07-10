package model;

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
				String.format("INSERT INTO empresa.product; VALUES(null, '%s','%s',%d,%.2f);", 
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
	
	

}
