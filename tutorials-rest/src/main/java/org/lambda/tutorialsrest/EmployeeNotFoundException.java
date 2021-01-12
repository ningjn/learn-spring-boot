package org.lambda.tutorialsrest;

/**
 * @author Administrator
 */
public class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
