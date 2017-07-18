import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import service.EmployeeService;


public class RegisterController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
	ApplicationContext context = getApplicationContext();
		
		
		EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
		Employee emp = new Employee();
		emp.setName(request.getParameter("Name"));
		emp.setCity(request.getParameter("City"));
		
		employeeService.registerEmployee(emp);
		
		
		return null;
	}

}
