package householdsNumber;

import java.io.*;
import java.util.*;
 
public class CsvFileWriter {
	
	
	public static void csv() {
		PrintCity targetList = new PrintCity();
		 File csv = new File("C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\Result.csv");
	        BufferedWriter bw = null; 
			try {
				
				bw = new BufferedWriter(new FileWriter(csv, true));
				
				targetList.printCity();
				for (int j = 0; j < targetList.cityList.size(); j++) {
					bw.write(targetList.cityList.get(j));					
				}
				
				bw.newLine();
 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (bw != null) {
	                    bw.flush(); 
	                    bw.close(); 
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	}
}
