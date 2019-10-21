package birthdayChecker;

public class DaysToDays extends ToDays {
	private int b_day;
	private int days3;
	
	public DaysToDays(int b_day) {
		this.b_day = b_day;
	}
	
	@Override
	public int convert() {
		days3 = b_day;
		return days3;
	}

}
