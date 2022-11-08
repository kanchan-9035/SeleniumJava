package com.JustConceptClear;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.utility.Library;

// test function befor use
public class Readfile extends Library {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("Loactioon of teh project=="+System.getProperty("user.dir"
		 * )); FileReader reader=new FileReader(System.getProperty("user.dir") +
		 * "//src//test//resources//db.Properties");
		 * 
		 * objproperties.load(reader);
		 * 
		 * System.out.println(objproperties.getProperty("user"));
		 * 
		 * Properties objproperties=new Properties(); File objFile = new
		 * File(System.getProperty("user.dir") +
		 * "//src//test//resources//Config.Properties"); FileInputStream objInputStream;
		 * 
		 * objInputStream=new FileInputStream(objFile);
		 * objproperties.load(objInputStream);
		 * System.out.println(objproperties.getProperty("browser"));
		 */
		ReadPropertiesFile();// working
		LaunchBrowser();

	}

}
