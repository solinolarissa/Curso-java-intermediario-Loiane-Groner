package com.larissa.Aula85_100;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyy hh:mm:ss a z");

		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);

		System.out.println(sdf.format(data.getTime()));

		Date hoje = new Date();

		System.out.println(sdf.format(hoje));
		
		String d = sdf.format(hoje);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMM/yyyy");
		String minhaData = "20/02/2000";

		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);

			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) { 
            e.printStackTrace();


		}

	}

}
