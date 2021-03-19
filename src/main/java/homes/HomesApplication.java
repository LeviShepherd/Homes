package homes;
/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import homes.controller.BeanConfiguration;
import homes.beans.Homes;
import homes.beans.Realtor;
import homes.repository.HomesRepository;

@SpringBootApplication
public class HomesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HomesApplication.class, args);
	}
	
	@Autowired
	HomesRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		// Using an existing bean
		Homes h = appContext.getBean("homes", Homes.class);
		h.setPrice("150,000");
		h.setSqft("2500");
		h.setState("IA");
		h.setStreet("100 North Street");
		repo.save(h);
		
		// Creating a bean to use - not managed by Spring
		Homes a = new Homes();
		Realtor r = new Realtor();
		a.setRealtor(r);
		repo.save(a);
		
		List<Homes> allHomes = repo.findAll();
		for(Homes home: allHomes) {
			System.out.println(home.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
