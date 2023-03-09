package fr.fms.hmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.cgi.poei.Individu;

public class IndividuTableModel extends AbstractTableModel {

  private static final int COLONNE_NOM = 0;
  private static final int COLONNE_PRENOM = 1;

  private List<Individu> individus = new ArrayList<>();

  public IndividuTableModel(Individu ...individus) {
    this.individus.addAll(Arrays.asList(individus));
  }

  @Override
  public String getColumnName(int columnIndex) {
    switch (columnIndex) {
    case COLONNE_NOM:
      return "Nom";
    case COLONNE_PRENOM:
      return "Prénom";
    default:
      return "";
    }
  }

  @Override
  public int getColumnCount() {
    return 2;
  }

  @Override
  public int getRowCount() {
    return individus.size();
  }

  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return true;
  }

  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    switch (columnIndex) {
    case COLONNE_NOM:
      individus.get(rowIndex).setNom(aValue.toString());
      break;
    case COLONNE_PRENOM:
      individus.get(rowIndex).setPrenom(aValue.toString());
      break;
    }
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
    case COLONNE_NOM:
      return individus.get(rowIndex).getNom();
    case COLONNE_PRENOM:
      return individus.get(rowIndex).getPrenom();
    default:
      return "";
    }
  }

  public void addIndividu(Individu u) {
    this.individus.add(u);
    this.fireTableRowsInserted(this.individus.size()-1, this.individus.size()-1);
  }

  public void addIndividu() {
    this.addIndividu(new Individu());
  }

  public void fixMajuscule() {
    int rowIndex = 0;
    for (Individu individu : individus) {
      individu.setNom(fixMajuscule(individu.getNom(), rowIndex, COLONNE_NOM));
      individu.setPrenom(fixMajuscule(individu.getPrenom(), rowIndex, COLONNE_PRENOM));
      ++rowIndex;
    }
  }

  public List<Individu> getIndividus() {
    return individus;
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

