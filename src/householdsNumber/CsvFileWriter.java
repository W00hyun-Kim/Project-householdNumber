package householdsNumber;

import java.io.*;
import java.util.*;
 
public class CsvFileWriter {
	
	
	public static void csv() {
		PrintCity targetList = new PrintCity();
		Household finalized = new Household();
		 File csv = new File("C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\Final_Result.csv");
	        BufferedWriter bw = null; 
			try {				
				bw = new BufferedWriter(new FileWriter(csv, true));
				bw.write("행정구역(시군구)별,2021.11,2021.12,2022.01,2022.02\n"); 	
				
				Collections.sort(finalized.resultList);
				for (int j = 1; j < finalized.resultList.size(); j++) {
					bw.write(finalized.resultList.get(j));	
					bw.newLine();
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
