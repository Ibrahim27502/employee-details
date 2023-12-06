package org.emp;
import org.company2.Company;
import org.client2.	Client;
import org.project2.Project;
public class Employee2 {
	public void empName() {
		System.out.println("ibrahim");

	}
public static void main(String[] args) {
	Employee2 e = new Employee2();
	e.empName();
	Company i = new Company();
	Client c = new Client();
	Project p = new Project();
	i.companyName();
	c.clientName();
	p.projectName();
}
}
