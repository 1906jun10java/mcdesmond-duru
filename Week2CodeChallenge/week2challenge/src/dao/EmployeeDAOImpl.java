package dao;

import java.sql.Connection;

public interface EmployeeDAOImpl {
	pubic Employee getEmployee() {
		Connection connection = Connectting.getConnection();
	}
    Set<Employee> getAllEmployees(){
    	Connection connection = Connectting.getConnection();
    }
    User getUserByUserNameAndPassword() {
    	Connection connection = Connectting.getConnection();
    }
    boolean insertEmployee() {
    	Connection connection = Connectting.getConnection();
    }
    boolean updateEmployee() {
    	Connection connection = Connectting.getConnection();
    }
    boolean deleteEmplyee() {
    	Connection connection = Connectting.getConnection();
    }
}
