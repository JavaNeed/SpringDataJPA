import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.coderevisited.spring.jpa.Stock;
import com.coderevisited.spring.jpa.StockRepository;


public class StockTest {
	private CrudRepository<Stock, Integer> repository;

	@Before
	public void beforeTest(){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		repository = context.getBean(StockRepository.class);
	}
	
	@Test
	public void testStock() {
		System.out.println("---- Test Stock ---");
		
		Stock stock1 = new Stock("Stock-1", "BSE-1", "Nagpur");
		Stock stock2 = new Stock("Stock-2", "BSE-2", "Wardha");
		Stock stock3 = new Stock("Stock-3", "BSE-3", "Amravati");
		
		repository.save(stock1);
		repository.save(stock2);
		repository.save(stock3);

	
		Iterable<Stock> iterable = repository.findAll();
		for (Stock stock : iterable) {
			System.out.println("---------------------");
			System.out.println(stock.getStockId());
			System.out.println(stock.getStockAddress());
			System.out.println(stock.getStockCode());
			System.out.println(stock.getStockName());
		}
	}

}
