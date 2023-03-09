package fr.fms.hmi;

import java.util.ArrayList;

import fr.fms.dao.ProductDao;
import fr.fms.entities.Product;

public class Controller {
	
ProductDao productDao = new ProductDao();
ArrayList<Product> products;


public Controller() {
	this.products = getMonArrayList();
}



public ArrayList<Product> getMonArrayList() {
	return productDao.readAll();
}
	
	
//	this.products = productDao.readAll(); 
//	
//	Object[][] donnees = new Object[products.size()][5];
//	for (int i = 0; i < products.size(); i++) {			
//			donnees[i][0] = products.get(i).getId();
//			donnees[i][1] = products.get(i).getDescription();
//			donnees[i][2] = products.get(i).getBrand();
//			donnees[i][3] = products.get(i).getPrice();
//			donnees[i][4] = products.get(i).getCategory();
//	}
}
