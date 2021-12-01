import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		//교재 405페이지.
		//ArrayList : 원소의 추가, 삽입, 삭제 가능.
		// -> 크기가 고정이 아닌 가변의 길이.
		// -> 원하는 위치에 추가나 삭제가 쉽다.
		
		int[] array = new int[5];
		//ArrayList 선언방법
		//ArrayList<타입> 변수이름 = new ArrayList<타입>();
		ArrayList<String> arrayList = new ArrayList<String>();
//		ArrayList<String> arrayList = new ArrayList<>(); -> 가능
		var a = new ArrayList<String>(); // a는 문자열만 삽입하고 검색할 수 있는 ArrayList 객체이다.
		
		//값 추가 -> 변수이름.add()
		arrayList.add("승환");
		arrayList.add("병관");
		arrayList.add("수민");
		
		//원하는 위치에 값 추가. -> 삽입
		arrayList.add(1, "태경");
		
		
		//값 삭제 -> .remove("인덱스")
		arrayList.remove(arrayList.size()-1); //4-1 = 3
		arrayList.remove(1);
		
		
		
		
		//arrayList 출력
		//arrayList 의 크기 -> size()
		for(int i = 0; i < arrayList.size(); i++) {
			//값 가져오기 -> .get(index)
			System.out.println(arrayList.get(i));
		}
			
	
	}

}
