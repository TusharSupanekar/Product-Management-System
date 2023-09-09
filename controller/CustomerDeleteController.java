package controller;

import services.CustomerService;

public class CustomerDeleteController {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		boolean c = customerService.deleteCustomerById(4);
		System.out.println(c);
	}

}
