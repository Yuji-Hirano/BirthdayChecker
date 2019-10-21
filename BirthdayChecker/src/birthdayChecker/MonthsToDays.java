package birthdayChecker;

public class MonthsToDays extends ToDays {
	private int b_year, b_month;
	private int days2 = 0;

	public MonthsToDays(int b_year, int b_month) {
		this.b_year = b_year;
		this.b_month = b_month;
	}
	
	@Override
	public int convert() {
		for (int i = 1; i < b_month; i++) {
			switch(i) {
			    case 1:
			    case 3:
			    case 5:
			    case 7:
			    case 8:
			    case 10:
			    case 12:
			    	days2 += 31;
			    	break;
			    case 2:
					if (b_year % 4 != 0 || (b_year % 100 == 0 && b_year % 400 != 0)) {
						days2 += 28;
					} else {
						days2 += 29;
					}
					break;
			    case 4:
			    case 6:
			    case 9:
			    case 11:
			    	days2 += 30;
			}
		}
		return days2;
	}
}
