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
		System.out.println("Enter Phone number: ");
		String PhoneNumber = scan.next();
		flag = Pattern.matches("( )?[789]{1}[0-9]{9}", PhoneNumber);
		System.out.println(flag);
		if (flag){
			System.out.println("Phone number is valid :"+ PhoneNumber);
			map.put("PhoneNumber", PhoneNumber);
		}
		else{			
			System.out.println("Wrong input, TRY AGAIN");
			PhoneNumber = scan.next();
			flag = Pattern.matches("( )?[789]{1}[0-9]{9}", PhoneNumber);
			if (flag == false) {
				System.out.println("Wrong input");
				return;
			}
			else {
				System.out.println("Correct And Updated");
				map.put("PhoneNumber", PhoneNumber);
			}
		}
		System.out.println("Enter Mail_id: ");
		String Mail = scan.next();
		flag = Pattern.matches("[a-z0-9]{3,6}[@]{1}[a-z]{5}[.]{1}[a-z]{3}", Mail);
		System.out.println(flag);
		if (flag){
			System.out.println("First name is valid :"+ Mail);
			map.put("Mail", Mail);
		}
		else{			
			System.out.println("Wrong input, TRY AGAIN");
			Mail = scan.next();
			flag = Pattern.matches("[a-z0-9]{3,6}[@]{1}[a-z]{5}[.]{1}[a-z]{3}", Mail);
			if (flag == false) {
				System.out.println("Wrong input");
				return;
			}
			else {
				System.out.println("Correct And Updated");
				map.put("Mail", Mail);
			}
		}
		System.out.println("Enter Password");
		String Password = scan.next();
		flag = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$", Password);
		if (flag){
			System.out.println("Password is valid :"+ Password);
			map.put("Password", Password);
		}
		else{			
			System.out.println("Wrong input, TRY AGAIN");
			Password = scan.next();
			flag = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$", Password);
			if (flag == false) {
				System.out.println("Wrong input");
				return;
			}
			else {
				System.out.println("Correct And Updated");
				map.put("Password", Password);
			}
		}

		System.out.println(map);

	}
}
