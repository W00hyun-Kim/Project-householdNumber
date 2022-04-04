package householdsNumber;

import java.io.*;
import java.util.*;

public class Household {
	ArrayList<String> householdList = new ArrayList<String>();		
	public static void main(String[] args) {
		PrintCity addnumber = new PrintCity();
		addnumber.printCity();
//	public static void household() {
		
		//세대수 파일의 형식을 시 +군+구 형식으로 바꾸기
		try {
			final String fileName = "C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\행정구역_시군구_별_주민등록세대수_20220401200536.csv";		
			String tmp[] = new String[1];
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				
				String[] str = line.split(","); 
				
//				System.out.println(Arrays.toString(str));
				if(str[0].contains("광역시")||str[0].contains("특별시")||str[0].contains("특별자치시")
					||str[0].contains("특별자치도")||str[0].contains("남도")||str[0].contains("북도")) {
					tmp[0]="";	//initialize 
					tmp[0] = str[0]; //임시로 담아두기
					tmp[0]=tmp[0].replace("\"", "");
//					System.out.println(tmp[0]);
				}	
				
				if(str[0].contains("구")||str[0].contains("군")||str[0].contains("시")) {
					str[0] = tmp[0]+" "+str[0].replace("\"", "");
				}
				
				
				
//				System.out.println(Arrays.toString(str));
			}//while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			final String fileName2 = "C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\Result.csv";		
			BufferedReader br = new BufferedReader(new FileReader(fileName2));
			String line;
			while ((line = br.readLine()) != null) {

				
				
				
			}//while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

}
