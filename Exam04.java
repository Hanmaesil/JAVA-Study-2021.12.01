import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// ��������

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� : ");
			array[i] = sc.nextInt();
		}

		// ��������(�������� ->> �ε�ȣ �ٲٸ� ��������)
		for (int i = 0; i < array.length - 1; i++) {
//			minNUM : ���ذ�
			int maxNum = array[i];
			int minNumIndex = i; // ���ذ��� �ε���
			for (int j = i + 1; j < array.length; j++) {
				// ������ ���ذ����� ũ��, ���� �迭���� ���� ū ���� ã�Ƽ� �ٲپ�� �Ѵ�.
				if (maxNum < array[j]) {
					minNumIndex = j;
					maxNum = array[j];
				}
			}
//			���� ���� ���� ġȯ
			int temp = array[i];
			array[i] = array[minNumIndex];
			array[minNumIndex] = temp;
		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
	}
}
