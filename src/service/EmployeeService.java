package service;

import model.Employee;

public interface EmployeeService {
	
	public boolean registerEmployee(Employee employee) throws Exception;
	public boolean updateEmployee(Employee employee) throws Exception;

}
