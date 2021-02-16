package com.javapractice.javapkg1;

import com.javapractice.javapkg1.Coffee.coffeeSize;
//Enums restrict a variable to have one of only a few predefined values. 
//The values in this enumerated list are called enums
class Coffee {
	enum coffeeSize {
		small, medium, large
	};

	coffeeSize size;
// comment 1
}

public class ClassEnum {
	public static void main(String[] args) {
		Coffee c = new Coffee();
		c.size = coffeeSize.medium;
		System.out.println("Coffee Size : "+ c.size);
	}
}
