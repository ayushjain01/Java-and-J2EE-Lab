package MissedCallProg;

import java.text.SimpleDateFormat;  
import java.util.Date;

class CallerDetails {
	String date;
	String name;
	Long mob;
	
	//Using constructor overloading for unlisted and listed numbers.
	CallerDetails(Long mob)
	{
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date temp = new Date();
	    this.date = formatter.format(temp);
		this.name = "Private Number";
		this.mob = mob;
	}
	CallerDetails(String name, Long mob)
	{
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date temp = new Date();
	    this.date = formatter.format(temp);
		this.name = name;
		this.mob = mob;
	}
}
