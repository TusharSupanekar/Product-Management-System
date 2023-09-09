package controller;

import dto.CustomerDto;
import services.CustomerService;

public class CustomerUpdateController {
	public static void main(String[] args) {

		CustomerDto customerDto = new CustomerDto();
		customerDto.setName("Omkar");
		customerDto.setEmail("omkar@mail.com");
		CustomerService customerService = new CustomerService();
		boolean c = customerService.updateCustomer(4);
		System.out.println(c);
	}

}
