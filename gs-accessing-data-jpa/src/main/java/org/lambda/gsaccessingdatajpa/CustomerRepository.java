package org.lambda.gsaccessingdatajpa;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Administrator
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);

	/**
	 * 根据id获取Customer
	 * @param id id
	 * @return customer对象
	 */
	Customer findById(long id);
}
