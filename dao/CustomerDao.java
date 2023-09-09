package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import configuration.HelperClass;
import dto.CustomerDto;

public class CustomerDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	// To Delete a customer data
	public boolean deleteCustomerById(int id) {
		int i = 0;
		connection = helperClass.getConnection();
		String sql = "DELETE FROM customer WHERE Id=?";
		try {
			// Created statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passing the values to delimiters/placeholder
			preparedStatement.setInt(1, id);

			// Execute the Statement by executeUpdate
			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To get all data
	public boolean getCustomer(int id) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM Customer WHERE Id=?";
		try {
			// Create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (id > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To update customer data
	public boolean updateCustomer(int id) {
		connection = helperClass.getConnection();
		String sql = "UPDATE customer set name=?,email=? WHERE id=?";

		try {
			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// pass value to delimiters
			preparedStatement.setString(1, sql);
			preparedStatement.setString(2, sql);
			preparedStatement.setInt(3, id);

			// Execute statement
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (id > 0) {
			return true;

		} else {
			return false;
		}
	}

	public CustomerDto saveCustomer(CustomerDto customerDto) {

		connection = helperClass.getConnection();
		String sql = "INSERT INTO customer VALUES(?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, customerDto.getId());
			preparedStatement.setString(2, customerDto.getName());
			preparedStatement.setString(3, customerDto.getEmail());

			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customerDto;

	}

}
