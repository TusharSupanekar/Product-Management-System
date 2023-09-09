package services;

import dao.CustomerDao;
import dto.CustomerDto;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	public boolean deleteCustomerById(int id) {
		boolean c = customerDao.deleteCustomerById(id);
		return c;
	}

	public boolean getCustomer(int id) {
		boolean c = customerDao.getCustomer(id);
		return c;
	}

	public boolean updateCustomer(int id) {
		boolean c = customerDao.updateCustomer(id);
		return c;
	}

	public CustomerDto saveCustomer(CustomerDto customerDto) {
		CustomerDto c = customerDao.saveCustomer(customerDto);
		return c;
	}

}
