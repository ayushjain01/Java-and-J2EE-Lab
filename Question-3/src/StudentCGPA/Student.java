package StudentCGPA;

import java.util.Arrays;

public class Student {
	String name,usn,branch,address;
	int age;
	double sgpa[];
	double cgpa;
	
	public Student(String name, String usn, String branch, String address, int age, double[] sgpa, double cgpa) {
		super();
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.address = address;
		this.age = age;
		this.sgpa = sgpa;
		this.cgpa = cgpa;
	}

	
	@Override
	public String toString() {
		return "Student \n"
				+ "{Name : " + name + "\n"
				+ "USN : " + usn + "\n"
				+ "Branch : " + branch +"\n"
				+ "Address : " + address + "\n"
				+ "Age : " + age + "\n"
				+ "SGPA : " + Arrays.toString(sgpa) + "\n"
				+ "CGPA : " + cgpa + "]";
	}
}
