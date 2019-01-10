package com.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.lamda.bean.Laptop;

public class LamdaStart {

	public void sort() {
		Laptop lap1 = new Laptop(2014, "Dell", 12000, 8,2048);
		Laptop lap5 = new Laptop(2011, "Dell", 12000, 4,1024);
		Laptop lap3 = new Laptop(2012, "Acer", 12000, 8,1024);
		Laptop lap4 = new Laptop(2010, "Dell", 12000, 16,1024);
		Laptop lap6 = new Laptop(2013, "Apple", 12000, 32,2048);
		Laptop lap9 = new Laptop(2015, "Dell", 56000, 12,1024);
		Laptop lap8 = new Laptop(2010, "HP", 12000, 8,1024);
		Laptop lap7 = new Laptop(2019, "Dell", 12000, 8,1024);

		List<Laptop> l = new ArrayList<Laptop>();
		l.add(lap1);
		l.add(lap3);
		l.add(lap4);
		l.add(lap5);
		l.add(lap6);
		l.add(lap7);
		l.add(lap8);
		l.add(lap9);

		l.forEach(lo->System.out.println(lo));
		Comparator<Laptop> year = (Laptop l1, Laptop l2) -> {
			if (l1.getYear() > l2.getYear())
				return 1;
			else
				return -1;
		};

		l.sort(year);
		for (Laptop laptop : l) {
			System.out.println(laptop);
		}

		System.out.println("max"+l.stream().min(year).get().getYear());
	}

	public static void main(String args[]) {
		new LamdaStart().sort();

		Runnable r = () -> {
			System.out.println("runnnnn");
		};
		Thread th1 = new Thread(() -> {
			System.out.print("Hii");
		});

		th1.start();
		th1.run();
		Thread th2 = new Thread(r);
		th2.start();
		th2.run();
		
		
	}

}
