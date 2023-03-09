/**
 * Composant d'accès aux données de la table T_Articles dans la base de données Shop
 * @author El babili - 2022
 * 
 */

package fr.fms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.entities.Product;

public class ProductDao implements Dao<Product> {

//	public boolean createStatement(Article obj) {
//		try (Statement statement = connection.createStatement()){
//			String str = "INSERT INTO T_Articles (Description, Brand, UnitaryPrice)"
//						+ " VALUES ('"+ obj.getDescription()+"' ,'" + obj.getBrand() + "',"+ obj.getPrice() +" );";			
//			int row = statement.executeUpdate(str);
//			if(row == 1)		return true;
//		} catch (SQLException e) {
//			//e.printStackTrace();
//			logger.log(Level.SEVERE,"pb sql sur la création d'un article");
//		} 		
//		return false;
//	}
	public ProductDao() {
		//logger.info("Here we Go !");
	}

	@Override
	public boolean create(Product obj) {
		String str = "INSERT INTO T_Articles (Description, Brand, UnitaryPrice, IdCategory) VALUES (?,?,?,?);";	
		try (PreparedStatement ps = connection.prepareStatement(str)){
			ps.setString(1, obj.getDescription());
			ps.setString(2, obj.getBrand());
			ps.setDouble(3, obj.getPrice());	
			ps.setInt(4, obj.getCategory());
			if( ps.executeUpdate() == 1)	return true;
		} catch (SQLException e) {
			logger.severe("pb sql sur la création d'un article " + e.getMessage());
		} 	
		return false;
	}

	@Override
	public Product read(int id) {
		try (Statement statement = connection.createStatement()){
			String str = "SELECT * FROM T_Articles where IdArticle=" + id + ";";									
			ResultSet rs = statement.executeQuery(str);
			if(rs.next()) return new Product(rs.getInt(1) , rs.getString(2) , rs.getString(3) , rs.getDouble(4));
		} catch (SQLException e) {
			logger.severe("pb sql sur la lecture d'un article " + e.getMessage());
		} 	
		return null;
	}

	@Override
	public boolean update(Product obj) {
		String str = "UPDATE T_Articles set Description=? , Brand=? where idArticle=?;";	
		try (PreparedStatement ps = connection.prepareStatement(str)){				
			ps.setString(1, obj.getDescription());
			ps.setString(2, obj.getBrand());
			ps.setDouble(3, obj.getPrice());	
			ps.setInt(3, obj.getId());
			if( ps.executeUpdate() == 1)	return true;
			return true;
		} catch (SQLException e) {
			logger.severe("pb sql sur la mise à jour d'un article " + e.getMessage());
		} 	
		return false;
	}

	@Override
	public boolean delete(Product obj) {
		try (Statement statement = connection.createStatement()){
			String str = "DELETE FROM T_Articles where IdArticle=" + obj.getId() + ";";									
			statement.executeUpdate(str);		
			return true;
		} catch (SQLException e) {
			logger.severe("pb sql sur la suppression d'un article " + e.getMessage());
		} 	
		return false;
	}

	@Override
	public ArrayList<Product> readAll() {
		ArrayList<Product> articles = new ArrayList<Product>();
		String strSql = "SELECT * FROM T_Articles";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrice = resultSet.getDouble(4);		
					articles.add((new Product(rsId,rsDescription,rsBrand,rsPrice)));						
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur l'affichage des articles " + e.getMessage());
		}	
		catch (Exception e) {
			logger.severe("pb : " + e.getMessage());
		}
		return articles;
	}
	
	public ArrayList<Product> readAllByCat(int id) {
		ArrayList<Product> articles = new ArrayList<Product>();
		String strSql = "SELECT * FROM T_Articles where idCategory=" + id;		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrice = resultSet.getDouble(4);		
					articles.add((new Product(rsId,rsDescription,rsBrand,rsPrice)));						
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur l'affichage des articles par catégories " + e.getMessage());
		}			
		return articles;
	}
}
