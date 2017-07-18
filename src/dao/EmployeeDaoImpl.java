package dao;

import model.Employee;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public boolean registerEmployee(Employee employee) throws Exception {
		 hibernateTemplate.save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		hibernateTemplate.update(employee);
		return true;
	}

}
