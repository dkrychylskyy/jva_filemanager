package com.dk.filemanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		File file = new File("test.txt");
		
		readFile(file);
	}

	public static ArrayList<String> readFile (File file){
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			try {
				String line = br.readLine();
				while (line != null) {
					line = br.readLine();
					System.out.println(line);
				}
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
}
