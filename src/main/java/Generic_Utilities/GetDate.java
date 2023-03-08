package Generic_Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.text.DateFormatter;

import org.apache.commons.collections4.Get;


public class GetDate {
	/**
	 * This method is used to get the current date
	 * @return
	 */
	public String getCurrentdate()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
	   return sdf.format(new Date());
		
	}
 /**
  * This method is used to get future or past date from the current date and we should pass the day
  * @param day
  * @return
  */
	public String getPastOrFutureDate(int day)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		//in order to add day creat object for calender
		Calendar cal = Calendar.getInstance();	
		cal.add(Calendar.DAY_OF_MONTH,day);
		return sdf.format(cal.getTime());

	}
	/**
	 * This method is used to get the current date and time
	 * @return
	 */
	
	public String getcurrentDateTime()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String date = sdf.format(new Date());
		return date;
		
		
	}
	public String setDate(String date,int day) throws ParseException
	{
	  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	 Calendar cal = Calendar.getInstance();
	 cal.setTime(sdf.parse(date));
	 cal.add(Calendar.DAY_OF_MONTH,day);
     return sdf.format(cal.getTime());
	 
	}
/**
 * This method is used to convert month into number.and pass the parameter
   starting three letter of month and first letter must be caps. 
 * @param mon
 * @return
 */
	public int ConevertMonIntoNum(String mon)
	{
		
		return DateTimeFormatter.ofPattern("MMM").withLocale(Locale.ENGLISH).parse(mon).get(ChronoField.MONTH_OF_YEAR);
		
		
		
	}
	




}





