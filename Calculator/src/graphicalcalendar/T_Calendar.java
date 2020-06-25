package graphicalcalendar;

import java.util.*;

public class T_Calendar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Year:");
		
		int selectedyear=sc.nextInt();
		System.out.print("Enter the month:");
		int selectedmonth=sc.nextInt()-1;
		Calendar cal=new GregorianCalendar();
		int cDay=cal.get(Calendar.DATE);
		int cMonth=cal.get(Calendar.MONTH);
		int cYear=cal.get(Calendar.YEAR);
		GregorianCalendar gcal=new GregorianCalendar(selectedyear,selectedmonth,1);
		int days=gcal.getActualMaximum(Calendar.DATE);
		int startinweek=gcal.get(Calendar.DAY_OF_WEEK);
	
//		gcal=new GregorianCalendar(selectedyear,selectedmonth,days);
		int totalweeks=gcal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		System.out.println(totalweeks);
//		System.out.println("cday ="+cDay+" \n cmonth "+cMonth+"\n cyear"+cYear+"\ndays"+days+"\nstartinweek:"+startinweek);
		int count=1;  // count the days
		
		System.err.println("SU  MO  TU  WE  TH  FR  SA");
		for(int i=1; i<=totalweeks; i++)
		{
			System.out.println();
			for(int j=1; j<=7; j++)
			{
				if(count<startinweek|| (count-startinweek+1)>days)
				{
				
						System.out.print("__  ");
				}
				else
				{
					if((cDay==(count-startinweek+1))&& cMonth==selectedmonth &&cYear==selectedyear)
					{
					System.out.print("'"+getDay((count-startinweek+1))+"'  ");
					}
					else
					{
						System.out.print(getDay((count-startinweek+1))+"  ");
					}
				}
				count++;
				
			}
		}
		
		

	}
	public static String getDay(int i)
	{
		String sDate=Integer.toString(i);
		if(sDate.length()==1)
		{
			sDate='0'+sDate;
			return sDate;
		}
		
			return sDate;
		
		
	}

}
