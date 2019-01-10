package com.lamda;

public class Laptop {
	
	private Integer year;
	private String size;
	private Integer price;
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer name) {
		this.year = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Laptop(Integer name, String size, Integer price) {
		super();
		this.year = name;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + year + ", size=" + size + ", price=" + price
				+ "]";
	}
	
	

}
