/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package homes.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Homes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String street;
	private String city;
	private String state;
	private String price;
	private String sqft;
	@Autowired
	private Realtor realtor;

	public Homes() {
		super();
		this.city = "Des Moines";
		this.state = "IA";
	}
	
	public Homes(String city) {
		super();
		this.city = city;
	}

	public Homes(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Homes(String street, String city, String state, String price) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.price = price;
	}

	public Homes(long id, String street, String city, String state, String price, String sqft) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.price = price;
		this.sqft = sqft;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSqft() {
		return sqft;
	}

	public void setSqft(String sqft) {
		this.sqft = sqft;
	}

	public Realtor getRealtor() {
		return realtor;
	}

	public void setRealtor(Realtor realtor) {
		this.realtor = realtor;
	}

	@Override
	public String toString() {
		return "Homes [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", price=" + price
				+ ", sqft=" + sqft + ", realtor=" + realtor + "]";
	}

}
