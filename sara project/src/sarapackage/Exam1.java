package sarapackage;
import java.util.Scanner;
public class Exam1 {
// SARA HACHECHE 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your number choice between 1 and 12: ");
	        int monthNumber = scanner.nextInt();

	        String month;

	        switch (monthNumber) {
	            case 1:
	                month = "January";
	                break;
	            case 2:
	                month = "February";
	                break;
	            case 3:
	                month = "March";
	                break;
	            case 4:
	                month = "April";
	                break;
	            case 5:
	                month = "May";
	                break;
	            case 6:
	                month = "June";
	                break;
	            case 7:
	                month = "July";
	                break;
	            case 8:
	                month = "August";
	                break;
	            case 9:
	                month = "September";
	                break;
	            case 10:
	                month = "October";
	                break;
	            case 11:
	                month = "November";
	                break;
	            case 12:
	                month = "December";
	                break;
	            default:
	                month = " Month Invalid";
	                break;
	        }

	        System.out.println(month);
	        scanner.close();
	}

}
