package com.company;

public class Main {

    public static void main(String[] args) {

		int a = 5;
		int b = 6;
		System.out.println("Before Xor a=" + a + ", " + "b=" + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Xor a=" + a + ", " + "b=" + b);


		int[] array = {1, 6, 2, 1, 2, 4, 6};
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			x = x ^ array[i];
		}
		System.out.println("The single element is:"+ x);

	}

}
