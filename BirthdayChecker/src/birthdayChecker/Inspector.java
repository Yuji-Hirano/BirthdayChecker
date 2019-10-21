package birthdayChecker;

public class Inspector {
	private String birthday;
	private int b_number;
	private int b_year;
	private int b_month;
	private int b_day;

	public Inspector(String birthday) {
		this.birthday = birthday;
	}
	
	public void inspect() {
		try {
			setB_number(Integer.parseInt(birthday));
		} catch(NumberFormatException e) {
			System.out.println("数字以外の文字が入っています。");
			System.exit(0);
		}
		try {
		    b_year = Integer.parseInt(birthday.substring(0, 4));
		    b_month = Integer.parseInt(birthday.substring(4, 6));
		    b_day = Integer.parseInt(birthday.substring(6, 8));
		} catch (Exception e) {
			System.out.println("8桁で入力してください。");
			System.exit(0);
		}
		
		if (birthday.length() != 8) {
			System.out.println("8桁で入力してください。");
			System.exit(0);
		} else if (b_year < 0){
			System.out.println("年が範囲外です。");
			System.exit(0);
		} else if (b_month < 0 || b_month > 12) {
			System.out.println("月が範囲外です。");
			System.exit(0);
		} else {
			switch (b_month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (b_day > 31 || b_day < 0) {
				    System.out.println("日が範囲外です。");
				    System.exit(0);
				}
				break;
			case 2 :
				if (b_year % 4 != 0 || (b_year % 100 == 0 && b_year % 400 != 0)) {
					if (b_day > 28 || b_day < 0) {
						System.out.println("日が範囲外です。11");
						System.exit(0);
					}
				} else if (b_day > 29 || b_day < 0) {
					System.out.println("日が範囲外です。12");
					System.exit(0);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (b_day > 30 || b_day < 0) {
					System.out.println("日が範囲外です。15");
					System.exit(0);
				}
		    }
		}
	}

	public int getB_number() {
		return b_number;
	}

	public void setB_number(int b_number) {
		this.b_number = b_number;
	}
	
	public int getB_year() {
		return b_year;
	}
	
	public int getB_month() {
		return b_month;
	}
	
	public int getB_day() {
		return b_day;
	}
}
