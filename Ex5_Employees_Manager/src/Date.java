import java.util.Objects;


public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {

		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}

		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}

		if (year >= 1) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			System.out.println("Invalid value for day. The default day is 1!");
			this.day = 1;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("Invalid value for month. The default month is 1!");
			this.month = 1;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1) {
			this.year = year;
		} else {
			System.out.println("Invalid value for year. The default year is 1!");
			this.year = 1;
		}
	}
	
	public void setDate(int d, int m, int y) {

		System.out.println("Input day: ");
		d = test.sc.nextInt();
		test.sc.nextLine();
		this.setDay(d);
		System.out.println("Input month: ");
		m = test.sc.nextInt();
		test.sc.nextLine();
		this.setMonth(m);
		System.out.println("Input year: ");
		y = test.sc.nextInt();
		test.sc.nextLine();
		this.setYear(y);
//		test.sc.close();
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
}

