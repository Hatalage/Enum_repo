package com.enumdemo;

import java.util.Scanner;

public class PizzaDemo {
	enum PizzaSize {

		SMALL(6), MEDIUM(8), LARGE(10);

		int size;

		private PizzaSize(int size) {
			this.size = size;

		}
	}

	public class PizzaSizeCheck {

		public static void main(String[] args) {

			for (PizzaSize n : PizzaSize.values()) {
				System.out.println(n + ":" + n.size + " inches");
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("Which pizza size you want to check :");
			String str = sc.next().toUpperCase();
			System.out.println(PizzaSize.valueOf(str).size);

		}
	}
}
