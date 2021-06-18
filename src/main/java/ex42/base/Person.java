package ex42.base;

public class Person {
	public static final int COLUMN_SIZE = 10;
	private static String FIRST_NAME = "";
	private static String LAST_NAME = "";
	private static int SALARY = 0;

	public String getFirstName() {
		return FIRST_NAME;
	}

	public String getLastName() {
		return LAST_NAME;
	}

	public int getSalary() {
		return SALARY;
	}

	private void setFirstName(String firstName) {
		FIRST_NAME = firstName;
	}

	private void setLastName(String lastName) {
		LAST_NAME = lastName;
	}

	private void setSalary(int sal) {
		Person.SALARY = sal;
	}

	public Person(String fname, String lname, int sal) {
		setFirstName(fname);
		setLastName(lname);
		setSalary(sal);
	}

	@Override
	public String toString () {
		return formatFirstName().append(formatLastName()).append(SALARY).append("\n").toString();
	}

	private StringBuilder formatFirstName() {
		StringBuilder fname = new StringBuilder(FIRST_NAME);
		while(fname.length() != COLUMN_SIZE) {
			fname.append(" ");
		}
		return fname;
	}

	private StringBuilder formatLastName() {
		StringBuilder lname = new StringBuilder(LAST_NAME);
		while(lname.length() != COLUMN_SIZE) {
			lname.append(" ");
		}
		return lname;
	}
}
