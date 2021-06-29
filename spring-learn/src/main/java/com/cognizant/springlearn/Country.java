package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	String code;
	String name;
	
	Logger LOGGER = LoggerFactory.getLogger(Country.class);
		
	public Country() {
		super();
		LOGGER.debug("Inside Country Constructor");
	}

	public String getCode() {
		LOGGER.debug("Inside getCode");
		return code;
	}

	public void setCode(String code) {
		LOGGER.debug("Inside setCode");
		this.code = code;
	}

	public String getName() {
		LOGGER.debug("Inside getName");
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("Inside setName");
		this.name = name;
	}

	@Override
	public String toString() {
		LOGGER.info("Inside toString method");
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
}
