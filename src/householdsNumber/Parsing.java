package householdsNumber;
 
import java.io.*;
import java.util.*;
 
public class Parsing {
	public static HashSet<String> gangwon = new HashSet<String>();
	public static HashSet<String> gyeonggi = new HashSet<String>();
	public static HashSet<String> gyeongnam = new HashSet<String>();
	public static HashSet<String> gyeongbuk = new HashSet<String>();
	public static HashSet<String> gwangju = new HashSet<String>();
	public static HashSet<String> daegu = new HashSet<String>();
	public static HashSet<String> daejeon = new HashSet<String>();
	public static HashSet<String> busan = new HashSet<String>();
	public static HashSet<String> seoul = new HashSet<String>();
	public static HashSet<String> sejong = new HashSet<String>();
	public static HashSet<String> ulsan = new HashSet<String>();
	public static HashSet<String> incheon = new HashSet<String>();
	public static HashSet<String> jeonnam = new HashSet<String>();
	public static HashSet<String> jeonbuk = new HashSet<String>();
	public static HashSet<String> jeju = new HashSet<String>();
	public static HashSet<String> chungnam = new HashSet<String>();
	public static HashSet<String> chungbuk = new HashSet<String>();
	public static String inputCity;
	
//	public void parsing() {
	public static void main(String[] args) {
		PrintCity printcity = new PrintCity();
		
		final String fileName = "C:\\Users\\whKim\\Desktop\\DataProcessing-Number of households\\한국행정구역분류_2022.4.1.기준.csv";
		Scanner sc = new Scanner(System.in);
		System.out.println("시/도를 입력하세요.");
		inputCity = sc.nextLine();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				String[] str = line.split(",");		//str[2]key : 시도  str[4]value : 시군구
				if(str.length<4 || str[2].equals("시도")||str[4].equals("")) {
					continue;
				}
				if(str[2].equals("강원도")) {
					gangwon.add(str[4]);
				} else if(str[2].equals("경기도")) {
					gyeonggi.add(str[4]);
				} else if(str[2].equals("경상남도")) {
					gyeongnam.add(str[4]);
				} else if(str[2].equals("경상북도")) {
					gyeongbuk.add(str[4]);
				} else if(str[2].equals("광주광역시")) {
					gwangju.add(str[4]);
				} else if(str[2].equals("대구광역시")) {
					daegu.add(str[4]);
				} else if(str[2].equals("대전광역시")) {
					daejeon.add(str[4]);
				} else if(str[2].equals("부산광역시")) {
					busan.add(str[4]);
				} else if(str[2].equals("서울특별시")) {
					seoul.add(str[4]);
				} else if(str[2].equals("세종특별자치시")) {
					sejong.add(str[4]);
				} else if(str[2].equals("울산광역시")) {
					ulsan.add(str[4]);
				} else if(str[2].equals("인천광역시")) {
					incheon.add(str[4]);
				} else if(str[2].equals("전라남도")) {
					jeonnam.add(str[4]);
				} else if(str[2].equals("전라북도")) {
					jeonbuk.add(str[4]);
				} else if(str[2].equals("제주특별자치도")) {
					jeju.add(str[4]);
				} else if(str[2].equals("충청남도")) {
					chungnam.add(str[4]);
				} else if(str[2].equals("충청북도")) {
					chungbuk.add(str[4]);
				} 			
			} //while

			//print
			printcity.printCity();
			
									
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
 
 
}