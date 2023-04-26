package MissedCallProg;

import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Telephone myTelephone = new Telephone();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("------------------------Menu------------------------");
			System.out.println("1.Add Contact\n"
					+ "2.Add Missed Call\n"
					+ "3.Display Contacts\n"
					+ "4.Dsiplay Missed Calls\n"
					+ "5.Delete Contact\n"
					+ "6.EXIT\n"
					+ "Enter your choice : ");
			
			int i=sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Enter Mobile Number : ");
				long mob=sc.nextLong();
				System.out.println("Enter Name : ");
				String name=sc.nextLine();
				name += sc.nextLine();
				if (name.equals("") == true)
					myTelephone.addNewContact(new CallerDetails(mob));
				else 
					myTelephone.addNewContact(new CallerDetails(name,mob));
				break;
			case 2:
				System.out.println("Enter Mobile Number : ");
				long mob1=sc.nextLong();
				myTelephone.addMissedCall(mob1);
				break;
			case 3:
				myTelephone.displayContacts();
				break;
			case 4:
				myTelephone.displayMissedCalls();
				break;
			case 5:
				System.out.println("Enter Mobile Number : ");
				long mob2=sc.nextLong();
				myTelephone.deleteContact(mob2);
				break;
			case 6:
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid Option!");
			}
		}
	}
}
