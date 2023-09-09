package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import configuration.HelperClass;
import dto.ProductDto;

public class ProductDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	// To Delete a product data
	public boolean deleteProductById(int id) {
		int i = 0;
		connection = helperClass.getConnection();
		String sql = "DELETE FROM product WHERE Id=?";
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
	public boolean getProduct(int id) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM product WHERE Id=?";
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

	// To update product data
	public boolean updateProduct(int id) {
		connection = helperClass.getConnection();
		String sql = "UPDATE product set name=?,price=15825.58 WHERE id=?";

		try {
			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// pass value to delimiters
			preparedStatement.setString(1, sql);
//				preparedStatement.setDouble(2, sql);
			preparedStatement.setInt(1, id);

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

	public ProductDto saveProduct(ProductDto productDto) {

		connection = helperClass.getConnection();
		String sql = "INSERT INTO product VALUES(?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, productDto.getId());
			preparedStatement.setString(2, productDto.getName());
			preparedStatement.setDouble(3, productDto.getPrice());

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
		return productDto;

	}

}
