package EMailValidation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MailValidation {

	public static void main(String[] args) {
		
		System.out.println("Enter First Name");
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		Map<Object, String> map = new HashMap<Object, String>();
		String FirstName = scan.next();
		flag = Pattern.matches("[A-Z]{1}[a-z]{2,}", FirstName);
		if (flag){
			System.out.println("First name is valid :"+ FirstName);
			map.put("FirstName", FirstName);
		}
		else{			
			System.out.println("Wrong input, TRY AGAIN");
			FirstName = scan.next();
			flag = Pattern.matches("[A-Z]{1}[a-z]{2,}", FirstName);
			if (flag == false) {
				System.out.println("Wrong input");
				return;
			}
			else {
				System.out.println("Correct And Updated");
				map.put("FirstName", FirstName);
			}
		}
		System.out.println("Enter Last Name: ");
		String LastName = scan.next();
		flag = Pattern.matches("[A-Z]{1}[a-z]{2,}", LastName);
		if (flag){
			System.out.println("Last name is valid :"+ LastName);
			map.put(LastName, "LastName");
		}
		else{			
			System.out.println("Wrong input, TRY AGAIN");
			LastName = scan.next();
			flag = Pattern.matches("[A-Z]{1}[a-z]{2,}", LastName);
			if (flag == false) {
				System.out.println("Wrong input");
				return;
			}
			else {
				System.out.println("Correct And Updated");
				map.put("LastName", LastName);
			}
		}
	}
}
