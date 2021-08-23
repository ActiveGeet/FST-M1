package activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file = new File("src/files/NewFile.txt"); 
		boolean status = file.createNewFile();
		  
		if(status) { 
			System.out.println("File created successfully!"); 
		} 
		else {
			System.out.println("File already exists at this path."); 
		}

		FileWriter fw = new FileWriter(file);
		fw.write("Activity 14"); 
		fw.close();
		System.out.println("Successfully wrote to the file.");
		 
		File fileUtil = FileUtils.getFile(file);
		 
		System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil,"UTF8"));
		
		Thread.sleep(10000);
		
		if(fileUtil.delete()) { 
			System.out.println("File deleted successfully"); 
		}
		else { 
			System.out.println("Failed to delete the file"); 
		}
	}
}