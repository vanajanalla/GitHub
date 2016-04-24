package businessLogics;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;

import java.util.Calendar;

import dao.DataBaseOperation;


public class GeneratorId 
{
	public static String generatorId(int sno)
	{
		
		String s="GID-";
		/*GID-20160001;*/
		//int year=Calendar.YEAR;
	
		
	Calendar calender=new GregorianCalendar();
	int year=calender.get(Calendar.YEAR);
			int  value=sno+1;
			DecimalFormat df=new DecimalFormat("0000");
			String gid =df.format(value);
	         String result=s+year+gid;
		
		
		return result;
		
		
	}
	

}
