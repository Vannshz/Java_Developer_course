package com.practice.Java_Assigments;


import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Assignment4 {
	Date signUpDate, currentDate;
	String stringStartDate, stringEndDate;
	Date startDate, endDate;

	public void range(String inputSignUpDate, String inputCurrentDate) {
		try {
			int flag = 0;
			//Date to string convertion
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
			signUpDate = dateFormatter.parse(inputSignUpDate);
			currentDate = dateFormatter.parse(inputCurrentDate);
			//checking the validity of date
			if (signUpDate.after(currentDate)) {
				System.out.println("No range");
				flag = 1;
			} else {
				startDate = signUpDate;
				//setting Start date year to current date year
				startDate.setYear(currentDate.getYear());
				//creating calendar object
				Calendar calendar = Calendar.getInstance();
				//setting startdate as calender current date
				calendar.setTime(startDate);
				//subtracting 30 days from the calender date
				calendar.add(Calendar.DATE, -30);
				startDate = calendar.getTime();
				//adding 60 days to the calender date
				calendar.add(Calendar.DATE, 60);
				endDate = calendar.getTime();
				//verify the end date if end date passes the current date than set as current date
				if (endDate.after(currentDate)) {
					endDate = currentDate;
				}
			}
			if (flag == 0) {

				stringStartDate = dateFormatter.format(startDate);
				stringEndDate = dateFormatter.format(endDate);

				System.out.print(stringStartDate);
				System.out.print("	");
				System.out.println(stringEndDate);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}


}
class Main
{
	public static void main(String[] args) {
		Assignment4 obj=new Assignment4();
		obj.range("16-07-1998", "27-06-2017");
		obj.range("04-02-2016", "04-04-2017");
		obj.range("04-05-2017", "04-04-2017");
		obj.range("04-04-2015", "04-04-2016");
		obj.range("04-04-2015", "15-03-2016");
	}
}