package householdsNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrintCity {
	public static ArrayList<String> cityList = new ArrayList<String>();
	
	public static void printCity() {
		Parsing parsing = new Parsing();
			// converting HashSet to arraylist
        	ArrayList<String> gangwon = new ArrayList<>(parsing.gangwon);
			Collections.sort(gangwon);
			System.out.println("[강원도]");
			for (int i = 0; i < gangwon.size(); i++) {
				System.out.println(gangwon.get(i)); 
				cityList.add(gangwon.get(i)+"\n");
			} System.out.println();
		
			ArrayList<String> gyeonggi = new ArrayList<>(parsing.gyeonggi);
			Collections.sort(gyeonggi);
			System.out.println("[경기도]");
			for (int i = 0; i < gyeonggi.size(); i++) {
				System.out.println(gyeonggi.get(i)); 
				cityList.add(gyeonggi.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> gyeongnam = new ArrayList<>(parsing.gyeongnam);
			Collections.sort(gyeongnam);
			System.out.println("[경상남도]");
			for (int i = 0; i < gyeongnam.size(); i++) {
				System.out.println(gyeongnam.get(i)); 
				cityList.add(gyeongnam.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> gyeongbuk = new ArrayList<>(parsing.gyeongbuk);
			Collections.sort(gyeongbuk);
			System.out.println("[경상북도]");
			for (int i = 0; i < gyeongbuk.size(); i++) {
				System.out.println(gyeongbuk.get(i)); 
				cityList.add(gyeongbuk.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> gwangju = new ArrayList<>(parsing.gwangju);
			Collections.sort(gwangju);
			System.out.println("[광주광역시]");
			for (int i = 0; i < gwangju.size(); i++) {
				System.out.println(gwangju.get(i)); 
				cityList.add(gwangju.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> daegu = new ArrayList<>(parsing.daegu);
			Collections.sort(daegu);
			System.out.println("[대구광역시]");
			for (int i = 0; i < daegu.size(); i++) {
				System.out.println(daegu.get(i)); 
				cityList.add(daegu.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> daejeon = new ArrayList<>(parsing.daejeon);
			Collections.sort(daejeon);
			System.out.println("[대전광역시]");
			for (int i = 0; i < daejeon.size(); i++) {
				System.out.println(daejeon.get(i)); 
				cityList.add(daejeon.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> busan = new ArrayList<>(parsing.busan);
			Collections.sort(busan);
			System.out.println("[부산광역시]");
			for (int i = 0; i < busan.size(); i++) {
				System.out.println(busan.get(i)); 
				cityList.add(busan.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> seoul = new ArrayList<>(parsing.seoul);
			Collections.sort(seoul);
			System.out.println("[서울특별시]");
			for (int i = 0; i < seoul.size(); i++) {
				System.out.println(seoul.get(i)); 
				cityList.add(seoul.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> sejong = new ArrayList<>(parsing.sejong);
			Collections.sort(sejong);
			System.out.println("[세종특별자치시]");
			for (int i = 0; i < sejong.size(); i++) {
				System.out.println(sejong.get(i)); 
				cityList.add(sejong.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> ulsan = new ArrayList<>(parsing.ulsan);
			Collections.sort(ulsan);
			System.out.println("[울산광역시]");
			for (int i = 0; i < ulsan.size(); i++) {
				System.out.println(ulsan.get(i)); 
				cityList.add(ulsan.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> incheon = new ArrayList<>(parsing.incheon);
			Collections.sort(incheon);
			System.out.println("[인천광역시]");
			for (int i = 0; i < incheon.size(); i++) {
				System.out.println(incheon.get(i)); 
				cityList.add(incheon.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> jeonnam = new ArrayList<>(parsing.jeonnam);
			Collections.sort(jeonnam);
			System.out.println("[전라남도]");
			for (int i = 0; i < jeonnam.size(); i++) {
				System.out.println(jeonnam.get(i));
				cityList.add(jeonnam.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> jeonbuk = new ArrayList<>(parsing.jeonbuk);
			Collections.sort(incheon);
			System.out.println("[전라북도]");
			for (int i = 0; i < jeonbuk.size(); i++) {
				System.out.println(jeonbuk.get(i)); 
				cityList.add(jeonbuk.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> jeju = new ArrayList<>(parsing.jeju);
			Collections.sort(jeju);
			System.out.println("[제주특별자치도]");
			for (int i = 0; i < jeju.size(); i++) {
				System.out.println(jeju.get(i)); 
				cityList.add(jeju.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> chungnam = new ArrayList<>(parsing.chungnam);
			Collections.sort(chungnam);
			System.out.println("[충청남도]");
			for (int i = 0; i < chungnam.size(); i++) {
				System.out.println(chungnam.get(i)); 
				cityList.add(chungnam.get(i)+"\n");
			} System.out.println();
			
			ArrayList<String> chungbuk = new ArrayList<>(parsing.chungbuk);
			Collections.sort(chungbuk);
			System.out.println("[충청북도]");
			for (int i = 0; i < chungbuk.size(); i++) {
				System.out.println(chungbuk.get(i)); 
				cityList.add(chungbuk.get(i)+"\n");
			} System.out.println();

	}
}
