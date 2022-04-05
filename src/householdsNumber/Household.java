package householdsNumber;

import java.io.*;
import java.util.*;

public class Household {
	public static ArrayList<String> householdList = new ArrayList<String>();
	public static ArrayList<String> targetlist = new ArrayList<String>();
	public static ArrayList<String> resultList = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		PrintCity addnumber = new PrintCity();
//		addnumber.printCity();
//	public static void household() {
		
		//세대수 파일의 형식을 시 +군+구 형식으로 바꾸기
		try {

			final String fileName = "C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\행정구역_시군구_별_주민등록세대수_20220401200536.csv";		
			String tmp[] = new String[1];
			String tmp2[] = new String[1];
			BufferedReader br = new BufferedReader(new FileReader(fileName));
						
			String line;
			while ((line = br.readLine()) != null) {
				
				String[] str = line.split(","); 
				
				//세대 파일은 앞에 광역시,특별시가 안붙어있기에 임의로 붙여준다.
				if(str[0].contains("광역시")||str[0].contains("특별시")||str[0].contains("특별자치시")
					||str[0].contains("특별자치도")||str[0].contains("남도")||str[0].contains("북도")
					||str[0].contains("경기도")||str[0].contains("강원도")) {
					tmp[0]="";	//initialize 
					tmp[0] = str[0]; //임시로 담아두기
					tmp[0]=tmp[0].replace("\"", "");
//					System.out.println(tmp[0]);
				}					
				
				if(str[0].contains("구")||str[0].contains("군")||str[0].contains("시")) {
					str[0] = tmp[0]+" "+str[0].replace("\"", "");
				}
								
				String number = "";
				for (int i = 0; i < str.length; i++) {
					if(i==0) {
						number = number+str[i];
					} else {
						number = number + ","+str[i];						
					}
				}
				householdList.add(number);															
			}//while
//			System.out.println(householdList);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//파일 합치기
		try {
			final String fileName2 = "C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\Result.csv";		
			BufferedReader br = new BufferedReader(new FileReader(fileName2));
			String line;
			while ((line = br.readLine()) != null) {
				
//				System.out.println(line);
				
				//행정구역과 세대파일의 행정구역 부분이 같은 경우 
				for (int i = 0; i < householdList.size(); i++) {	
					String temp[]=householdList.get(i).split(",");
					if(line.equals(temp[0])) {
						line = line + "," + temp[1]+","+temp[2]+","+temp[3]+","+temp[4];
//						System.out.println(line);
					
					//경기도 고양시 덕양구와 같이 나온 경우, 세대 파일에는 경기도만 붙였기에 경기도 덕양구로 반영되어있음
					} else if (line.split(" ").length==3) {	//경기도 고양시 덕양구, 경기도 성남시 분당구....
						for (int j = 0; j < householdList.size(); j++) {
							String three[]=householdList.get(j).split(",");
							//기존 행정구역 파일을 경기도 덕양구로 짤라서 붙인다음에 비교했음
							String temp2 = line.split(" ")[0] + " " + line.split(" ")[2];
							if(temp2.equals(three[0])) {
								line = line + "," + three[1]+","+three[2]+","+three[3]+","+three[4];
//								System.out.println(line);
							}
							
						}
					}
				}
																
				resultList.add(line);
				Collections.sort(resultList);

			}
			
			System.out.println(resultList);
//			System.out.println(resultList.size());
			CsvFileWriter.csv();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
