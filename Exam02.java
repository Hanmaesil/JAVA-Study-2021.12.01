import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// �ǽ� : ���� mp3 �����.
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		while (true) {
			System.out.println("[1]�뷡�߰� [2]�뷡���� [3]�뷡�˻� [4]����");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("=====list=====");
				print(musiclist);
				System.out.println("==============");
				System.out.print("�߰��� �뷡 : ");
				String name = sc.next();
				musiclist.add(name);
			} else if (input == 2) {
				System.out.print("������ �뷡 ��ȣ �Է� : ");
				int deleteNumber = sc.nextInt();
				musiclist.remove(deleteNumber - 1);
				print(musiclist);
			} else if (input == 3) {
				System.out.print("�˻��� �뷡 ���� �Է� : ");
				String search = sc.next();
//				  boolean choice = false;

				for (int i = 0; i < musiclist.size(); i++) {
					if (search.equals(musiclist.get(i))) {
						System.out.println("�˻��� �뷡�� " + (i + 1) + "��°�� �ֽ��ϴ�.");
//						 choice = true;
					} else if (!search.equals(musiclist.get(i)))
						System.out.println("�˻��� �뷡�� �����ϴ�.");
					break;
//					 if(choice == false) {
//			               System.out.println("�˻��� �뷡�� �����ϴ�!");
//			            }

				}

			} else if (input == 4) {
				System.out.println("���α׷� ����.");
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
