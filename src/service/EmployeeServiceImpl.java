package service;

import model.Employee;
import dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public boolean registerEmployee(Employee employee) throws Exception {
		employeeDao.registerEmployee(employee);
		
		
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		employeeDao.updateEmployee(employee);
		return true;
	}

}
