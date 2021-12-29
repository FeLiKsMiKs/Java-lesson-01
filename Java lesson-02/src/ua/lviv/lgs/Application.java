package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		int day = 4;
		String dayString;
		switch (day) {
		    case 1:  dayString = "Monday";
		    System.out.println("Прочитати книжку");         
		    break;
		    case 2:  dayString = "Tuesday";
		    System.out.println("Зробити Логос");         
		    break;
		    case 3:  dayString = "Wednesday";
		    System.out.println("Підготувати презентацію");
		    break;
		    case 4:  dayString = "Thursday";
		    System.out.println("Підготуватися до екзамену");         
		    break;
		    case 5:  dayString = "Friday";
		    System.out.println("Подивитися кіно");       
		    break;
		    case 6:  dayString = "Saturday";
		    System.out.println("Пограти у футбол");         
		    break;
		    case 7:  dayString = "Sunday";
		    System.out.println("Відпочивати");         
		    break;
		    default: dayString = "Error";
		    System.out.println("Помилка");         
		    break;
		}
		
		
	}

	
}
