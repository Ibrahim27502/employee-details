package org.emp;
import org.company.Company;
import org.client.Client;
import org.project.Project;
public class Employee {
	private void empname() {
		System.out.println("emp name is ibrahim");

	}
public static void main(String[] args) {
	Employee w = new Employee();
	w.empname();
	Company e = new Company();
	e.companyName();
	Client r = new Client();
	r.clientName();
	Project t = new Project();
	t.projectName();
	
}
}
