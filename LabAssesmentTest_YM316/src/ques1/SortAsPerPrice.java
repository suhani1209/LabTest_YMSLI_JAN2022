package ques1;

import java.util.Comparator;

public class SortAsPerPrice implements Comparator<Merchandises>{
	@Override
	public int compare(Merchandises m1, Merchandises m2) {
		return Double.compare(m2.getPrice(),m1.getPrice());
	}

}