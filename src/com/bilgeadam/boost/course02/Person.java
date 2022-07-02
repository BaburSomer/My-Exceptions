package com.bilgeadam.boost.course02;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Person {
	protected String name;
	protected int    age;
	protected Person marriedTo;

	public Person(String name, int age) {
		this.age       = age;
		this.name      = name;
		this.marriedTo = null;
	}

	abstract public void marry(Person anotherPerson) throws IllegalMariageException;
	abstract public Person marriedTo();

}
