package ques2;

public class Date {
	private int date;
	private int month;
	private int year;
	
	public Date() {}
	
	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	Date(Date date1){
		this.date=date1.date;
		this.month=date1.month;
		this.year=date1.year;
	}
	public void print() {
		this.toString();
	}

	@Override
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
}
