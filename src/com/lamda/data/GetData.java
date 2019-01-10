package com.lamda.data;

import java.util.ArrayList;
import java.util.List;

import com.lamda.bean.Laptop;



public class GetData {

	public LoadData getLoadLaptopData() {
		return loadLaptopData;
	}

	private  LoadData loadLaptopData= () -> {
		Laptop lap1 = new Laptop(2014, "Lenovo", 12000, 8, 2048);
		Laptop lap5 = new Laptop(2011, "Dell", 12000, 4, 1024);
		Laptop lap3 = new Laptop(2012, "Acer", 212000, 8, 1024);
		Laptop lap4 = new Laptop(2010, "Dell", 120300, 16, 1024);
		Laptop lap6 = new Laptop(2013, "Apple", 12000, 32, 2048);
		Laptop lap9 = new Laptop(2015, "Dell", 56000, 12, 1024);
		Laptop lap8 = new Laptop(2010, "HP", 12000, 8, 1024);
		Laptop lap7 = new Laptop(2019, "Dell", 12000, 8, 1024);

		List<Laptop> l = new ArrayList<Laptop>();
		l.add(lap1);
		l.add(lap3);
		l.add(lap4);
		l.add(lap5);
		l.add(lap6);
		l.add(lap7);
		l.add(lap8);
		l.add(lap9);
		return l;
	};
	
	public List<Laptop> getData(LoadData l){
		return l.loadData();
	}
}
