import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.coderevisited.spring.jpa.Customer;
import com.coderevisited.spring.repository.CustomerRepository;


public class CustomerTest {
	private AbstractApplicationContext context = null;
	
	@Before
	public void beforeTest(){
		context = new ClassPathXmlApplicationContext("spring-config.xml");
	}
	
	
	@Test
	public void testCustomer() {
		System.out.println("TEST CUSTOMERS");
		CrudRepository<Customer, Long> repository = context.getBean(CustomerRepository.class);
		Iterable<Customer> iterable = repository.findAll();
		for (Customer customer : iterable) {
			System.out.println("---------------------------");
			System.out.println(customer.getContactFirstName());
			System.out.println(customer.getContactLastName());
			System.out.println(customer.getAddressLine1());
			System.out.println(customer.getAddressLine2());
			System.out.println(customer.getCity());
			System.out.println(customer.getCountry());
			System.out.println(customer.getCustomerName());
		}
	}

}
