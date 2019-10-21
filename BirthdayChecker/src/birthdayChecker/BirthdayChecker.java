package birthdayChecker;

import java.util.Scanner;

public class BirthdayChecker {
	public static void main(String[] args) {
		int b_year, b_month, b_day;
		int days1, days2, days3;
		String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String yourDay;
		
		System.out.println("あなたの誕生日をyyyyMMdd形式で入力してください。");
		Scanner sc = new Scanner(System.in);
		String birthday = sc.nextLine();
		sc.close();
		
		Inspector insp = new Inspector(birthday);
		insp.inspect();
		
		b_year = insp.getB_year();
		b_month = insp.getB_month();
		b_day = insp.getB_day();
		
		YearsToDays ytd = new YearsToDays(b_year);
		days1 = ytd.convert();
		
		MonthsToDays mtd = new MonthsToDays(b_year, b_month);
		days2 = mtd.convert();
		
		DaysToDays dtd = new DaysToDays(b_day);
		days3 = dtd.convert();
		
		yourDay = day[(days1 + days2 + days3) % 7];
		
		if (days3 == 13 && yourDay == "Friday") {
			System.out.println("ジェイソン・ボーヒーズは、ホラー映画『13日の金曜日』 \nシリーズに"
					+ "登場する架空の人物・怪物である。");
		} else {
			System.out.println("あなたは13日の金曜日生まれではありません。");
		}
	}

}
