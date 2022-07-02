package com.bilgeadam.boost.course02;

public class Employee extends Person {

	public Employee(String name, int age) {
		super(name, age);
	}

	@Override
	public void marry(Person anotherPerson) throws IllegalMariageException {
		if (age <= 18) {
			throw new IllegalMariageException("18 yaşından küçükler evlenemez");
		}
		else if (this.marriedTo != null) {
			throw new IllegalMariageException("Evli olanlar yeniden evlenemez");
		}
		else {
			this.marriedTo = anotherPerson;
		}
	}

	@Override
	public Person marriedTo() {
		return this.marriedTo;
	}
}
