package householdsNumber;

import java.util.Iterator;

public class PrintCity {

	public static void printCity() {
		Parsing parsing = new Parsing();

		if (parsing.inputCity.equals("강원도")) {
			Iterator<String> it = parsing.gangwon.iterator();
			while (it.hasNext()) {
				System.out.println("강원도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("경기도")) {
			Iterator<String> it = parsing.gyeonggi.iterator();
			while (it.hasNext()) {
				System.out.println("경기도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("경상남도")) {
			Iterator<String> it = parsing.gyeongnam.iterator();
			while (it.hasNext()) {
				System.out.println("경상남도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("경상북도")) {
			Iterator<String> it = parsing.gyeongbuk.iterator();
			while (it.hasNext()) {
				System.out.println("경상북도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("광주광역시")) {
			Iterator<String> it = parsing.gwangju.iterator();
			while (it.hasNext()) {
				System.out.println("광주광역시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("대구광역시")) {
			Iterator<String> it = parsing.daegu.iterator();
			while (it.hasNext()) {
				System.out.println("대구광역시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("대전광역시")) {
			Iterator<String> it = parsing.daejeon.iterator();
			while (it.hasNext()) {
				System.out.println("대전광역시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("부산광역시")) {
			Iterator<String> it = parsing.busan.iterator();
			while (it.hasNext()) {
				System.out.println("부산광역시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("서울특별시")) {
			Iterator<String> it = parsing.seoul.iterator();
			while (it.hasNext()) {
				System.out.println("서울특별시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("세종특별자치시")) {
			Iterator<String> it = parsing.sejong.iterator();
			while (it.hasNext()) {
				System.out.println("세종특별자치시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("울산광역시")) {
			Iterator<String> it = parsing.ulsan.iterator();
			while (it.hasNext()) {
				System.out.println("울산광역시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("인천광역시")) {
			Iterator<String> it = parsing.incheon.iterator();
			while (it.hasNext()) {
				System.out.println("인천광역시 " + it.next());
			}
		}
		if (parsing.inputCity.equals("전라남도")) {
			Iterator<String> it = parsing.jeonnam.iterator();
			while (it.hasNext()) {
				System.out.println("전라남도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("전라북도")) {
			Iterator<String> it = parsing.jeonbuk.iterator();
			while (it.hasNext()) {
				System.out.println("전라북도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("제주특별자치도")) {
			Iterator<String> it = parsing.jeju.iterator();
			while (it.hasNext()) {
				System.out.println("제주특별자치도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("충청남도")) {
			Iterator<String> it = parsing.chungnam.iterator();
			while (it.hasNext()) {
				System.out.println("충청남도 " + it.next());
			}
		}
		if (parsing.inputCity.equals("충청북도")) {
			Iterator<String> it = parsing.chungbuk.iterator();
			while (it.hasNext()) {
				System.out.println("충청북도 " + it.next());
			}
		}

	}
}
