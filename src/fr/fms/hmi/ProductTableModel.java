package fr.fms.hmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;


import fr.fms.entities.Product;

public class ProductTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int COLONNE_ID = 0;
	private static final int COLONNE_DESCRIPTION = 1;
	private static final int COLONNE_BRAND = 2;
	private static final int COLONNE_PRICE = 3;
	private static final int COLONNE_ID_CATEGORY = 4;

	private List<Product> products = new ArrayList<>();

	public ProductTableModel(Product ...individus) {
		products.addAll(Arrays.asList(individus));
		System.out.println(products);
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case COLONNE_ID:
			return "ID";
		case COLONNE_DESCRIPTION:
			return "DESCRIPTION";
		case COLONNE_BRAND:
			return "BRAND";
		case COLONNE_PRICE:
			return "PRICE";
		case COLONNE_ID_CATEGORY:
			return "ID CATEGORY";
		default:
			return "";
		}
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public int getRowCount() {
		return products.size();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		//    switch (columnIndex) {
		//    case COLONNE_ID:
		//      products.get(rowIndex).setId(aValue.toString());
		//      break;
		//    case COLONNE_DESCRIPTION:
		//      products.get(rowIndex).setDescription(aValue.toString());
		//      break;
		//    case COLONNE_BRAND:
		//        products.get(rowIndex).getBrand(aValue.toString());
		//        break;
		//    case COLONNE_PRICE:
		//        products.get(rowIndex).getPrice(aValue.toString());
		//        break;
		//    case COLONNE_ID_CATEGORY:
		//        products.get(rowIndex).getCategory(aValue.toString());
		//        break;
		//    }
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case COLONNE_ID:
			return products.get(rowIndex).getId();

		case COLONNE_DESCRIPTION:
			return products.get(rowIndex).getDescription();

		case COLONNE_BRAND:
			return products.get(rowIndex).getBrand();

		case COLONNE_PRICE:
			return products.get(rowIndex).getPrice();

		case COLONNE_ID_CATEGORY:
			return products.get(rowIndex).getCategory();

		default:
			return "";
		}
	}

	public void addIndividu(Product u) {
		this.products.add(u);
		this.fireTableRowsInserted(this.products.size()-1, this.products.size()-1);
	}

	public void addIndividu() {
		this.addIndividu(new Product());
	}

	public void fixMajuscule() {
		int rowIndex = 0;
		for (Product individu : products) {
			//      individu.setNom(fixMajuscule(individu.getNom(), rowIndex, COLONNE_NOM));
			//      individu.setPrenom(fixMajuscule(individu.getPrenom(), rowIndex, COLONNE_PRENOM));
			++rowIndex;
		}
	}

	public List<Product> getIndividus() {
		return products;
	}

	private String fixMajuscule(String value, int rowIndex, int columnIndex) {
		if (value == null || value.length() == 0) {
			return value;
		}

		if (Character.isLowerCase(value.charAt(0))) {
			this.fireTableCellUpdated(rowIndex, columnIndex);
			return value.substring(0, 1).toUpperCase() + value.substring(1);
		}
		return value;
	}

}