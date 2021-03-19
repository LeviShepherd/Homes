/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package homes.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import homes.beans.Homes;
import homes.beans.Realtor;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Homes homes() {
		Homes bean = new Homes("Des Moines");
		return bean;
	}
	
	@Bean
	public Realtor realtor() {
		Realtor bean = new Realtor("Karen Smith", "Iowa Realty", "515-555-5555");
		return bean;
	}
}
