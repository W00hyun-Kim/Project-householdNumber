package householdsNumber;

import java.io.*;
import java.util.*;
 
public class CsvFileWriter {
 
	public static void csv(String input) {
 
		 File csv = new File("C:\\DataProcessing-Number of households\\Result\\Result.csv");
	        BufferedWriter bw = null; 
			try {
				bw = new BufferedWriter(new FileWriter(csv, true));
				bw.write(input);
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
