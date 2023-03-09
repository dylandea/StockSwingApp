/**
 * Composant d'accès aux données de la table T_Articles dans la base de données Shop
 * @author El babili - 2022
 * 
 */

package fr.fms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.entities.Product;

public class ProductDao implements Dao<Product> {

	@Override
	public boolean create(Product obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Product obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Product> readAll() {
		ArrayList<Product> products = new ArrayList<Product>();
		String strSql = "SELECT * FROM T_Product";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrice = resultSet.getDouble(4);
					String rsCategoryId = resultSet.getString(5);
					products.add((new Product(rsId,rsDescription,rsBrand,rsPrice, rsCategoryId)));	
					//System.out.println(rsCategoryId);
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur l'affichage des produits " + e.getMessage());
		}	
		catch (Exception e) {
			logger.severe("pb : " + e.getMessage());
		}
		return products;
		
	}

	
}
