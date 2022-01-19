package ques1;

import java.util.Comparator;

public class SortAsPerItemCode implements Comparator<Merchandises>{

	@Override
	public int compare(Merchandises m1, Merchandises m2) {
		return m1.getId().compareTo(m2.getId());
	}

}