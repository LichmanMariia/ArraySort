package org.itstep;

import java.util.ArrayList;

public class Model {

	private int number;
	private ArrayList<Integer> list;

	public ArrayList getArray() { // массив (коллекция) с изменяемой величиной
		return list;
	}

	public void setArray(ArrayList list) {
		this.list = list;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Model(int number, ArrayList list) {
		super();
		this.number = number;
		this.list = list;
	}

	public Model() {
		super();
	}

	public Model(ArrayList list) {
		super();
		this.list = list;
	}

	public ArrayList<Integer> getIndexArray() {
		int counter = 0;
		ArrayList<Integer> listIndex = new ArrayList<>();
		for (Integer numberIndex : list) {
			if (numberIndex == number) {
				listIndex.add(counter);
			}
			counter++;
		}
		return listIndex;
	}

	public String getStringIndex(ArrayList<Integer> list) {
		String result = "";
		for (Integer listIndex : list) {
			result = result + listIndex + " ";
		}
		return result;
	}

}
