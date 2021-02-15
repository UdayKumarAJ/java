package com.rough.example;

public class ClassB extends ClassA {

	@Override
	public void calling() {
		System.out.println("class B");
	}

	public static void main(String[] args) {
		ClassA a = new ClassB();
		a.calling();
	}
}
