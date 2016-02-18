import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.coderevisited.spring.jpa.Employee;
import com.coderevisited.spring.repository.EmployeeRepository;


public class EmployeeTest {
	
	private AbstractApplicationContext context = null;

	@Before
	public void beforeTest(){
		context = new ClassPathXmlApplicationContext("spring-config.xml");
	}
	
	
	@Test
	public void testEmployee() {
		System.out.println("--- Test Employee ---");
		CrudRepository<Employee, Long> repository = context.getBean(EmployeeRepository.class);
		
		Iterable<Employee> iterable = repository.findAll();
		for (Employee employee : iterable) {
			System.out.println("------------");
			System.out.println(employee.getFirstName());
			System.out.println(employee.getEmployeeNumber());
		}
	}

}
