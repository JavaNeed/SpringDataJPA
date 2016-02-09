import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.coderevisited.spring.jpa.Employee;
import com.coderevisited.spring.jpa.EmployeeRepository;


public class EmployeeTest {
	
	private CrudRepository<Employee, Integer> repository;

	@Before
	public void beforeTest(){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		repository = context.getBean(EmployeeRepository.class);
	}
	
	
	@Test
	public void testEmployee() {
		System.out.println("--- Test Employee ---");
		Employee employee1 = new Employee(22, "Saint", "Peter", "Engineering");
		Employee employee2 = new Employee(23, "Jack", " Dorsey", "Imaginea");
		Employee employee3 = new Employee(24, "Sam", "Fox", "Imaginea");
		
		repository.save(employee1);
		repository.save(employee2);
		repository.save(employee3);
		
		Iterable<Employee> iterable = repository.findAll();
		for (Employee employee : iterable) {
			System.out.println("-------------------");
			System.out.println(employee.getId());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getDept());
		}
	}

}
