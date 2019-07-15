package beans;

public class Employee {
	public Employee(int employee_id, String emp_firstname, String emp_lastname, int DEPARTMENT_ID, int salary,
			String EMP_EMAIL) {
		this.employee_id = employee_id;
		this.emp_firstname = emp_firstname;
		this.emp_lastname = emp_lastname;
		this.salary = salary;
		
	}

	private int employee_id;
	private String emp_firstname;
	private String emp_lastname;
	private int DEPARTMENT_ID;
	private int salary;
	private String EMP_EMAIL;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmp_firstname() {
		return emp_firstname;
	}

	public void setEmp_firstname(String emp_firstname) {
		this.emp_firstname = emp_firstname;
	}

	public String getEmp_lastname() {
		return emp_lastname;
	}

	public void setEmp_lastname(String emp_lastname) {
		this.emp_lastname = emp_lastname;
	}

	public int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEMP_EMAIL() {
		return EMP_EMAIL;
	}

	public void setEMP_EMAIL(String eMP_EMAIL) {
		EMP_EMAIL = eMP_EMAIL;
	}

	@Override
	public String toString() {
		return "employee [employee_id=" + employee_id + ", emp_firstname=" + emp_firstname + ", emp_lastname="
				+ emp_lastname + ", DEPARTMENT_ID=" + DEPARTMENT_ID + ", salary=" + salary + ", EMP_EMAIL=" + EMP_EMAIL
				+ "]";
	}

}
