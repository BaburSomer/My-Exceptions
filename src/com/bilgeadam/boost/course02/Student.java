package com.bilgeadam.boost.course02;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void marry(Person anotherPerson) throws IllegalMariageException {
		throw new IllegalMariageException("Bir öğrenci evlenemez");
	}

	@Override
	public Person marriedTo() {
		return this.marriedTo;
	}
}
