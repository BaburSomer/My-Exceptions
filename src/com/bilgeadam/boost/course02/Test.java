package com.bilgeadam.boost.course02;

public class Test {
	static Student[] students = new Student[6];
	static Employee[] employees = new Employee[6];
	
	public static void main(String[] args) /* throws IllegalMariageException DON'T DO THAT!!!!! */ {
		try {
			managePersons();
		}
		catch (IllegalMariageException ex) {
			System.out.println("Bir yerlerde bir hata oluşmuş. Son hata işlemeyi burada yapabilirim");
		}
	}

	private static void managePersons() throws IllegalMariageException {
		createPersons();
		try {
			maryWithEachOther();
		}
		catch (IllegalMariageException ex) {
			
			System.err.println(ex.getLocalizedMessage());
			throw ex;
		}
	}

	private static void maryWithEachOther() throws IllegalMariageException {
		for (int i=0; i<employees.length/2; i++) {
			employees[i].marry(employees[employees.length - i-1]);
		}
	
		for (int i=0; i<students.length/2; i++) {
			students[i].marry(students[students.length - i-1]);
		}
	}

	private static void createPersons() {
		createStudents();
		createEmployees();
	}

	private static void createEmployees() {
		employees[0] = new Employee("Çalışan 1", 45);
		employees[1] = new Employee("Çalışan 2", 17);
		employees[2] = new Employee("Çalışan 3", 25);
		employees[3] = new Employee("Çalışan 4", 32);
		employees[4] = new Employee("Çalışan 5", 18);
		employees[5] = new Employee("Çalışan 6", 99);
	}

	private static void createStudents() {
		students[0] = new Student("Öğrenci 1", 25);
		students[1] = new Student("Öğrenci 2", 15);
		students[2] = new Student("Öğrenci 3", 20);
		students[3] = new Student("Öğrenci 4", 19);
		students[4] = new Student("Öğrenci 5", 21);
		students[5] = new Student("Öğrenci 6", 15);
	}
}
