import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// 선택정렬

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// 입력부
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			array[i] = sc.nextInt();
		}

		// 선택정렬(내림차순 ->> 부등호 바꾸면 오름차순)
		for (int i = 0; i < array.length - 1; i++) {
//			minNUM : 기준값
			int maxNum = array[i];
			int minNumIndex = i; // 기준값의 인덱스
			for (int j = i + 1; j < array.length; j++) {
				// 현재의 기준값보다 크고, 남은 배열에서 제일 큰 값을 찾아서 바꾸어야 한다.
				if (maxNum < array[j]) {
					minNumIndex = j;
					maxNum = array[j];
				}
			}
//			가장 작은 값과 치환
			int temp = array[i];
			array[i] = array[minNumIndex];
			array[minNumIndex] = temp;
		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
	}
}
