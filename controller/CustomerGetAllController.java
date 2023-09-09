package controller;

import services.CustomerService;

public class CustomerGetAllController {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		boolean c = customerService.getCustomer(1);
		System.out.println(c);

	}

}
