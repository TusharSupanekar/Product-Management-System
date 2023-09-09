package controller;

import dto.CustomerDto;
import services.CustomerService;

public class CustomerSaveController {
	public static void main(String[] args) {

		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(2);
		customerDto.setName("Samay");
		customerDto.setEmail("samay@mail.com");

		CustomerService customerService = new CustomerService();
		CustomerDto c = customerService.saveCustomer(customerDto);
		if (c != null) {
			System.out.println(c.getId() + " Save Succesfully");

		}
	}

}
