import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// 실습 : 간이 mp3 만들기.
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		while (true) {
			System.out.println("[1]노래추가 [2]노래삭제 [3]노래검색 [4]종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("=====list=====");
				print(musiclist);
				System.out.println("==============");
				System.out.print("추가할 노래 : ");
				String name = sc.next();
				musiclist.add(name);
			} else if (input == 2) {
				System.out.print("삭제할 노래 번호 입력 : ");
				int deleteNumber = sc.nextInt();
				musiclist.remove(deleteNumber - 1);
				print(musiclist);
			} else if (input == 3) {
				System.out.print("검색할 노래 제목 입력 : ");
				String search = sc.next();
//				  boolean choice = false;

				for (int i = 0; i < musiclist.size(); i++) {
					if (search.equals(musiclist.get(i))) {
						System.out.println("검색한 노래는 " + (i + 1) + "번째에 있습니다.");
//						 choice = true;
					} else if (!search.equals(musiclist.get(i)))
						System.out.println("검색한 노래가 없습니다.");
					break;
//					 if(choice == false) {
//			               System.out.println("검색한 노래가 없습니다!");
//			            }

				}

			} else if (input == 4) {
				System.out.println("프로그램 종료.");
				break;
			}

		}

	}

	public static void print(ArrayList<String> name) {
		for (int i = 0; i < name.size(); i++) {
			System.out.println(i + 1 + "." + name.get(i));
		}
	}

}
