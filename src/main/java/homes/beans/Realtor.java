/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package homes.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Realtor {
	private String name;
	private String company;
	private String phone;
	
	public Realtor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Realtor(String name, String company, String phone) {
		super();
		this.name = name;
		this.company = company;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Realtor [name=" + name + ", company=" + company + ", phone=" + phone + "]";
	}
}
