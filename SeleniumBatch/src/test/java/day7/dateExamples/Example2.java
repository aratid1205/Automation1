package day7.dateExamples;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Example2 {

	public static void main(String[] args) {
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.DATE, -7);
	    SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
	    String date= s.format(new Date(cal.getTimeInMillis()));
	    System.out.println("Date: "+date);
	    
	    System.out.println("***********************************************");
	    Calendar cal2  = Calendar.getInstance();	    
	    cal2.add(Calendar.MONTH, 5);
	    SimpleDateFormat s2 = new SimpleDateFormat("dd-MMM-yyyy");
	    String date2= s2.format(new Date(cal2.getTimeInMillis()));
	    System.out.println("Date in month: "+date2);
	    
	    System.out.println("***********************************************");
	    Calendar cal3  = Calendar.getInstance();	    
	    cal3.add(Calendar.YEAR, -2);
	    SimpleDateFormat s3 = new SimpleDateFormat("dd-MMM-yyyy");
	    String date3= s3.format(new Date(cal3.getTimeInMillis()));
	    System.out.println("Date in month: "+date3);

	}

}
