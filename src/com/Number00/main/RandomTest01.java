package com.Number00.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RandomTest01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// file
		File file_input = 
				new File("..\\RandomTest01\\src\\com\\Number00\\textFile\\Input01");
		File file_output = 
				new File("..\\RandomTest01\\src\\com\\Number00\\textFile\\Output01");
		//Reader
		BufferedReader reader = new BufferedReader(new FileReader(file_input));
		//Writer
		BufferedWriter writer = new BufferedWriter(new FileWriter(file_output));
		
		String st;
		while((st = reader.readLine()) != null) {
			System.out.println(st);
			writer.write(st + " " + squared(Integer.valueOf(st))+"\n");
		}
				
		writer.close();
		reader.close();
	}
	
	static int squared(int input) {
		return input * input;
	}
	
}
