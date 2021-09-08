package com.gmail.klewzow;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Cat a = new Cat(5, 3, "Barsik", "Black");
		Cat e = new Cat(2, 4, "Vovka", "Green");
		Cat b = new Cat(2, 6, "Murka", "White");
		Cat c = new Cat(4, 1, "Kuzia", "Black");
		Cat d = new Cat(1, 7, "Luska", "Red");

		Cat[] arr = new Cat[] { a, e, b, d, c };

		Cat[] resultArray = Arrays.stream(arr).filter(el -> el.getWeigth() > 3)
				.sorted((el1, el2) -> el1.getName().compareTo(el2.getName())).toArray(Cat[]::new);
		Arrays.stream(resultArray).forEach(System.out::println);

	}

}
