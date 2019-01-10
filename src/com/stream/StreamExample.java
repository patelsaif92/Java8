package com.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lamda.bean.Laptop;
import com.lamda.data.GetData;

public class StreamExample {
	
	public static void main(String args[]){
		GetData data =  new GetData();
		List<Laptop> lapList = data.getData(data.getLoadLaptopData());
		lapList.stream().forEach(System.out::println);
		
		
		// Group laptops according to brand
		Map<String, List<Laptop>> orderedLapList = lapList.stream().collect(Collectors.groupingBy(Laptop::getName));
		
		orderedLapList.forEach((brand,laps)->{
			System.out.println("brand ::"+brand + "::::"+laps);
		});
		List<Laptop> filter = lapList.stream().filter(a -> a.getRam() >=8).collect(Collectors.toList());
		System.out.println(filter);
	}

}
