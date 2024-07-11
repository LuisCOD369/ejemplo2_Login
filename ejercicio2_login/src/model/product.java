package model;

import libreriaVersion3.Generica;

public class product {
	private Generica<String, Integer> dt1_p;
	private Generica<Double, ?>dt2_p;
	
	public product() {
		dt1_p=new Generica<>();
		dt2_p=new Generica<>();
		
	}
	public product(int id, String nameProduct, String description, int stock, double price) {
		dt1_p=new Generica<>(nameProduct, description, id, stock);
		dt2_p=new Generica<>(price);
	}
	public Integer getId() {
		return dt1_p.getAttribute3();
	}
	public void setId(int id) {
		this.dt1_p.setAttribute3(id);
	}
	public String getNameProduct() {
		return this.dt1_p.getAttribute1();
	}
	public void setNameProduct(String name_) {
		this.dt1_p.setAttribute1(name_);
	}
	public String getDescription() {
		return dt1_p.getAttribute2();
	}
	public void setDescription(String description_) {
		this.dt1_p.setAttribute2(description_);
	}
	public Integer getStock() {
		return dt1_p.getAttribute4();
	}
	public void setStock(int stock_) {
		this.dt1_p.setAttribute4(stock_);
	}
	public Double getPrice() {
		return dt2_p.getAttribute1();
	}
	public void setPrice(double price) {
		dt2_p.setAttribute1(price);
	}
	public String informationProduct() {
		return String.format("%d;%s;%s;%d;%.2f", getId(), getNameProduct(), getDescription(), getStock(), getPrice());
		
	}
	public product getProduct (String informationProduct) {
		String [ ] ip=informationProduct.split(";");
		this.setId(Integer.parseInt(ip[0]));
		this.setDescription(ip[3]);
		this.setNameProduct(ip[2]);
		this.setStock(Integer.parseInt(ip[4]));
		this.setPrice(Double.parseDouble(ip[5]));
		return this;
	}
	

}
