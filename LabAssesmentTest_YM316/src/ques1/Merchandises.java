package ques1;

public class Merchandises implements Comparable<Merchandises> {
	private String id;
	private int qty;
	private double price;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=").append(id).append(", qty=").append(qty).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}

	public Merchandises(String id, int qty, double price) {
		this.id = id;
		this.qty = qty;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(Merchandises m) {
		return this.id.compareTo(m.id);
	}
	
}