package MissedCallProg;

import java.util.*;

public class Telephone {
	
	private HashMap<Long, CallerDetails> phoneBook=new HashMap<>();
	private LinkedList<CallerDetails> missedCalls=new LinkedList<>();
	public void addNewContact(CallerDetails caller)
	{
		System.out.println("Adding new Contact...");
		if(phoneBook.put(caller.mob,caller)!=null)
			System.out.println("Existing Contact Found! Renaming...");
	}
	public void displayContacts() 
	{
		System.out.println("--------------------------Phone Book-----------------------------");
		System.out.printf("| %3s. | %-20s | %-20s |%n","No.","Name","Mob");
		System.out.println("-----------------------------------------------------------------");
		int count = 1;
		for (Map.Entry<Long,CallerDetails> entry : phoneBook.entrySet()) 
		{
			System.out.printf("| %3d. | %-20s | %-20s |%n",  count++,entry.getValue().name,entry.getKey());
			System.out.println("-----------------------------------------------------------------");
		}
	}
	public void deleteContact(Long mob)
	{
		if(phoneBook.remove(mob)==null)
			System.out.println("Contact Not Found");
		else
			System.out.println("Contact Deleted.");
	}
	public void addMissedCall(long mob)
	{
		if (phoneBook.containsKey(mob) == true)
		{
			CallerDetails caller = new CallerDetails(phoneBook.get(mob).name, mob);
			missedCalls.addFirst(caller);
		}
		else
		{
		missedCalls.addFirst(new CallerDetails(mob));
		}
		if(missedCalls.size()==11)
			missedCalls.removeLast();
	}
	public void displayMissedCalls()
	{
		System.out.println("---------------------------------------Missed Calls----------------------------------");
		System.out.printf("| %3s | %-20s | %-20s | %-20s |%n","No.","Name","Mob","Date and Time");
		System.out.println("-------------------------------------------------------------------------------------");
		int count = 1;
		for (CallerDetails caller : missedCalls) 
		{
			System.out.printf("| %3s | %-20s | %-20s | %-20s |%n",  count++,caller.name, caller.mob, caller.date);
			System.out.println("---------------------------------------------------------------------------------");
		
	}
}
}
