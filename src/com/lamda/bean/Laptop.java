package com.lamda.bean;

public class Laptop {

	private Integer year;
	private String name;
	private Integer price;
	private Integer ram;
	private Integer hdd;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer name) {
		this.year = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getHdd() {
		return hdd;
	}

	public void setHdd(Integer hdd) {
		this.hdd = hdd;
	}

	public Laptop(Integer year, String name, Integer price, Integer ram,
			Integer hdd) {
		super();
		this.year = year;
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Laptop [year=" + year + ", name=" + name + ", price=" + price
				+ ", ram=" + ram + ", hdd=" + hdd + "]";
	}

	
}
