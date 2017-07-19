package dao;

import model.Employee;

public interface EmployeeDao {
	
	public boolean registerEmployee(Employee emppp) throws Exception;
	public boolean updateEmployee(Employee employee) throws Exception;

}
