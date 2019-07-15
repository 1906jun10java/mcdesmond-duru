package dao;

public class EmployeeDAO {
	Employee getEmployee();
    Set<Employee> getAllEmployees();
    User getUserByUserNameAndPassword();
    boolean insertEmployee();
    boolean updateEmployee();
    boolean deleteEmplyee();
}
