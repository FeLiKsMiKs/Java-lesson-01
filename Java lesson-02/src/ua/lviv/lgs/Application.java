package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		int day = 4;
		String dayString;
		switch (day) {
		    case 1:  dayString = "Monday";
		    System.out.println("��������� ������");         
		    break;
		    case 2:  dayString = "Tuesday";
		    System.out.println("������� �����");         
		    break;
		    case 3:  dayString = "Wednesday";
		    System.out.println("ϳ��������� �����������");
		    break;
		    case 4:  dayString = "Thursday";
		    System.out.println("ϳ����������� �� ��������");         
		    break;
		    case 5:  dayString = "Friday";
		    System.out.println("���������� ���");       
		    break;
		    case 6:  dayString = "Saturday";
		    System.out.println("������� � ������");         
		    break;
		    case 7:  dayString = "Sunday";
		    System.out.println("³���������");         
		    break;
		    default: dayString = "Error";
		    System.out.println("�������");         
		    break;
		}
		
		
	}

	
}
