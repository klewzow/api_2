 package com.gmail.klewzow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Cat a = new Cat(5, 3, "Barsik", "Black");
		Cat e = new Cat(2, 4, "Vovka", "Green");
		Cat b = new Cat(2, 6, "Murka", "White");
		Cat c = new Cat(4, 1, "Kuzia", "Black");
		Cat d = new Cat(1, 7, "Luska", "Red");

		List<Cat> cat = new ArrayList<>(List.of(a, e, b, d, c));

		List<Cat> resultList = cat.stream().filter(el -> el.getWeigth() > 3)
				.sorted((el1, el2) -> el1.getName().compareTo(el2.getName())).collect(Collectors.toList());

		resultList.stream().forEach(System.out::println);

	}

}

