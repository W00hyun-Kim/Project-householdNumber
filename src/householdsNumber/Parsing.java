package householdsNumber;
 
import java.io.*;
import java.util.*;
 
public class Parsing {
	public static  HashSet<String> gangwon = new HashSet<String>();
	public static HashSet<String> gyeonggi = new HashSet<String>();
	public static HashSet<String> gyeongnam = new HashSet<String>();
	public static HashSet<String> gyeongbuk = new HashSet<String>();
	public static ArrayList<String> gwangju = new ArrayList<String>();
	public static ArrayList<String> daegu = new ArrayList<String>();
	public static ArrayList<String> daejeon = new ArrayList<String>();
	public static ArrayList<String> busan = new ArrayList<String>();
	public static ArrayList<String> seoul = new ArrayList<String>();
	public static ArrayList<String> sejong = new ArrayList<String>();
	public static ArrayList<String> ulsan = new ArrayList<String>();
	public static ArrayList<String> incheon = new ArrayList<String>();
	public static ArrayList<String> jeonnam = new ArrayList<String>();
	public static ArrayList<String> jeonbuk = new ArrayList<String>();
	public static ArrayList<String> jeju = new ArrayList<String>();
	public static ArrayList<String> chungnam = new ArrayList<String>();
	public static ArrayList<String> chungbuk = new ArrayList<String>();
//	public static String inputCity;
	
//	public void parsing() {
	public static void main(String[] args) {
		PrintCity printcity = new PrintCity();
		CsvFileWriter fw = new CsvFileWriter();
		
		final String fileName = "C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\한국행정구역분류_2022.4.1.기준.csv";
		Scanner sc = new Scanner(System.in);
//		System.out.println("시/도를 입력하세요.");
//		inputCity = sc.nextLine();
		String tmp[] =new String[1];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				String[] str = line.split(",");		//str[2]key : 시도  str[4]value : 시군구
				if(str.length<4 || str[2].equals("시도")||str[4].equals("")) {
					continue;
				}
				
				//강원도
				if(str[2].equals("강원도")&&str[4].contains("시")||str[2].equals("강원도")&&str[4].contains("군")) {
					gangwon.add(str[2]+" "+str[4]);
					
				//경기도	
				} else if(str[2].equals("경기도")&&str[4].contains("시")&&str[6].equals("")) {
					tmp[0] = str[2]+" "+str[4];  //경기도 ~~시										
				} else if(str[2].equals("경기도")&&str[4].contains("구")) {
					if(gyeonggi.contains(tmp[0]+" "+str[4])) {
						continue;
					}
					gyeonggi.add(tmp[0]+" "+str[4]);					
				} else if(str[2].equals("경기도")&&str[4].contains("시")) {
					if(gyeonggi.contains(str[2]+" "+str[4])) {
						continue;
					}
					gyeonggi.add(str[2]+" "+str[4]);
					
				//경상남도	
				} else if(str[2].equals("경상남도")&&str[4].contains("시")&&str[6].equals("")) {
					tmp[0] = str[2]+" "+str[4];  									
				} else if(str[2].equals("경상남도")&&str[4].contains("구")) {
					if(gyeongnam.contains(tmp[0]+" "+str[4])) {
						continue;
					}
					gyeongnam.add(tmp[0]+" "+str[4]);					
				} else if(str[2].equals("경상남도")&&str[4].contains("시")||str[2].equals("경상남도")&&str[4].contains("군")) {
					if(gyeongnam.contains(str[2]+" "+str[4])) {
						continue;
					}
					gyeongnam.add(str[2]+" "+str[4]);
					
				//경상북도	
				} else if(str[2].equals("경상북도")&&str[4].contains("시")&&str[6].equals("")) {
					tmp[0] = str[2]+" "+str[4];  		
					
				} else if (str[2].equals("경상북도") && str[4].contains("구")) {
					if (gyeongbuk.contains(tmp[0] + " " + str[4]) || gyeongbuk.contains(tmp[0])) {
						continue;
					}
					if (tmp[0].contains(str[4])) { // ex)구미시-->"구" 포함되었기에 예외처리
						gyeongbuk.add(tmp[0]);
					} else {
						gyeongbuk.add(tmp[0] + " " + str[4]);						
					}
				} else if(str[2].equals("경상북도")&&str[4].contains("시")||str[2].equals("경상북도")&&str[4].contains("군")) {
					if(gyeongbuk.contains(str[2]+" "+str[4])) {
						continue;
					}
					gyeongbuk.add(str[2]+" "+str[4]);
					
				//광주광역시	
				} else if(str[2].equals("광주광역시")) {
					if(gwangju.contains(str[2]+" "+str[4])) {
						continue;
					}
					gwangju.add(str[2]+" "+str[4]);									
														
				//대구광역시
				} else if(str[2].equals("대구광역시")) {
					if(daegu.contains(str[2]+" "+str[4])) {
						continue;
					}
					daegu.add(str[2]+" "+str[4]);									
				
				
				//대전광역시
				} else if(str[2].equals("대전광역시")) {
					if(daejeon.contains(str[2]+" "+str[4])) {
						continue;
					}
					daejeon.add(str[2]+" "+str[4]);									
				
				
				//부산광역시
				} else if(str[2].equals("부산광역시")) {
					if(busan.contains(str[2]+" "+str[4])) {
						continue;
					}
					busan.add(str[2]+" "+str[4]);									
				
				//서울특별시	
				} else if(str[2].equals("서울특별시")) {
					if(seoul.contains(str[2]+" "+str[4])) {
						continue;
					}
					seoul.add(str[2]+" "+str[4]);
					
					
				//세종특별자치시
				} else if (str[2].equals("세종특별자치시")) {
					if (sejong.contains(str[2] + " " + str[4])) {
						continue;
					}
					sejong.add(str[2] + " " + str[4]);
				

				//울산광역시
				} else if (str[2].equals("울산광역시")) {
					if (ulsan.contains(str[2] + " " + str[4])) {
						continue;
					}
					ulsan.add(str[2] + " " + str[4]);
				
				
				//인천광역시
				} else if (str[2].equals("인천광역시")) {
					if (incheon.contains(str[2] + " " + str[4])) {
						continue;
					}
					incheon.add(str[2] + " " + str[4]);
				
				//전라남도
				} else if (str[2].equals("전라남도")) {
					if (jeonnam.contains(str[2] + " " + str[4])) {
						continue;
					}
					jeonnam.add(str[2] + " " + str[4]);
				
				
				//전라북도
				} else if(str[2].equals("전라북도")&&str[4].contains("시")&&str[6].equals("")) {
					tmp[0] = str[2]+" "+str[4];  		
					
				} else if (str[2].equals("전라북도") && str[4].contains("구")) {
					if (jeonbuk.contains(tmp[0] + " " + str[4]) || jeonbuk.contains(tmp[0])) {
						continue;
					}
					if (tmp[0].contains(str[4])) { // ex)구미시-->"구" 포함되었기에 예외처리
						jeonbuk.add(tmp[0]);
					} else {
						jeonbuk.add(tmp[0] + " " + str[4]);						
					}
				} else if(str[2].equals("전라북도")&&str[4].contains("시")||str[2].equals("전라북도")&&str[4].contains("군")) {
					if(jeonbuk.contains(str[2]+" "+str[4])) {
						continue;
					}
					jeonbuk.add(str[2]+" "+str[4]);
				
				
				//제주특별자치도
				} else if (str[2].equals("제주특별자치도")) {
					if (jeju.contains(str[2] + " " + str[4])) {
						continue;
					}
					jeju.add(str[2] + " " + str[4]);
				

				//충청남도
				} else if(str[2].equals("충청남도")&&str[4].contains("시")&&str[6].equals("")) {
					tmp[0] = str[2]+" "+str[4];  		
					
				} else if (str[2].equals("충청남도") && str[4].contains("구")) {
					if (chungnam.contains(tmp[0] + " " + str[4]) || chungnam.contains(tmp[0])) {
						continue;
					}
					if (tmp[0].contains(str[4])) { // ex)구미시-->"구" 포함되었기에 예외처리
						chungnam.add(tmp[0]);
					} else {
						chungnam.add(tmp[0] + " " + str[4]);						
					}
				} else if(str[2].equals("충청남도")&&str[4].contains("시")||str[2].equals("충청남도")&&str[4].contains("군")) {
					if(chungnam.contains(str[2]+" "+str[4])) {
						continue;
					}
					chungnam.add(str[2]+" "+str[4]);
				
				//충청북도	
				} else if(str[2].equals("충청북도")&&str[4].contains("시")&&str[6].equals("")) {
					tmp[0] = str[2]+" "+str[4];  		
					
				} else if (str[2].equals("충청북도") && str[4].contains("구")) {
					if (chungbuk.contains(tmp[0] + " " + str[4]) || chungbuk.contains(tmp[0])) {
						continue;
					}
					if (tmp[0].contains(str[4])) { // ex)구미시-->"구" 포함되었기에 예외처리
						chungbuk.add(tmp[0]);
					} else {
						chungbuk.add(tmp[0] + " " + str[4]);						
					}
				} else if(str[2].equals("충청북도")&&str[4].contains("시")||str[2].equals("충청북도")&&str[4].contains("군")) {
					if(chungbuk.contains(str[2]+" "+str[4])) {
						continue;
					}
					chungbuk.add(str[2]+" "+str[4]);
				}
			
			} //while

			//print
//			printcity.printCity();
			
			//save as csv file
			fw.csv();
			
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
 
 
}