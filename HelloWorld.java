import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class HelloWorld {
	
		
	public static void main(String[] args) {
	
	/*	Result result = JUnitCore.runClasses(TestHello.class);
		for (Failure string : result.getFailures()) {
			System.out.println(string.toString());
		}
		
		System.out.println(result.wasSuccessful());*/
		
		
		fileReader fileReader = new fileReader();
		List<Student> studentList = fileReader.getAllStudent("E:\\Input\\Book1.xlsx");
		for (Student student : studentList) {
			System.out.println(student.getName());
		}
	}

}
