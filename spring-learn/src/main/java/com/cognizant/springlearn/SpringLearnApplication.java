package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
		try {
			displayDate();
			displayCountry();
			displayCountries();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void displayDate() throws ParseException {
		LOGGER.info("Starting display");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		String string = "31/12/2018";
		Date date = format.parse(string);
		System.out.println(date);
		LOGGER.info("Ending display");
	}

	public static void displayCountry() {
		LOGGER.info("Starting displayCountry method");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("countryList", Country.class);
		//Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		LOGGER.info("Ending displayCountry method");
	}
	
	public static void displayCountries() {
		LOGGER.info("Starting displayCountries method");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");		
		ArrayList<Country> countries= context.getBean("countryList",ArrayList.class);
		for(Country c : countries) {
			LOGGER.debug(c.toString());
		}
		LOGGER.info("Ending displayCountries method");
	}
}
