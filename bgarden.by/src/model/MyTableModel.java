package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = -2075846607051447717L;
	
	private String[] names = {"Регистрационный номер", "Название", "Тип", "Семейство",
			"Срок жизни", "Количество растений"};

	private ArrayList<String []> dataArray;
	
	public MyTableModel()
	{
		dataArray = new ArrayList<String[]>();
	}
	
	@Override
	public int getColumnCount() {
		return names.length;
	}

	@Override
	public int getRowCount() {
		return dataArray.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		if(column<5 && column>0)
			return dataArray.get(row)[column];
		else
			return new Integer(dataArray.get(row)[column]);
	}
	
	@Override
	public String getColumnName(int c)
	{
		return names[c];	
	}
	
	@Override
	public Class<?> getColumnClass(int column)
	{
			if(column<5 && column>0)return String.class;
			else return Integer.class;
	}
	
	@Override
	public void setValueAt(Object value, int row, int column) {
		dataArray.get(row)[column] = value.toString();
	}
	
	public void setData(ArrayList<String []> dataArray) {
		this.dataArray = dataArray;
	}
	
	public ArrayList<String[]> getData() {
		return dataArray;
	}
}
