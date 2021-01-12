package org.lambda.tutorialsrest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * @author Administrator
 */
@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String role;

	public Employee() {}

	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return (
			"Employee{" +
			"id=" +
			id +
			", name='" +
			name +
			'\'' +
			", role='" +
			role +
			'\'' +
			'}'
		);
	}
}
