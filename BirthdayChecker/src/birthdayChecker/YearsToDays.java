package birthdayChecker;

public class YearsToDays extends ToDays {
	private int b_year;
	private int days1 = 0;
	
	public YearsToDays(int b_year) {
		this.b_year = b_year;
	}
	
	@Override
	public int convert() {
		for(int i = 1; i < b_year; i++) {
			if (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) {
			    days1 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
			} else {
			    days1 += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;				
			}
		}
		return days1;
	}
}
