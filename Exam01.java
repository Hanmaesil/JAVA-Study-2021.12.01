import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		//���� 405������.
		//ArrayList : ������ �߰�, ����, ���� ����.
		// -> ũ�Ⱑ ������ �ƴ� ������ ����.
		// -> ���ϴ� ��ġ�� �߰��� ������ ����.
		
		int[] array = new int[5];
		//ArrayList ������
		//ArrayList<Ÿ��> �����̸� = new ArrayList<Ÿ��>();
		ArrayList<String> arrayList = new ArrayList<String>();
//		ArrayList<String> arrayList = new ArrayList<>(); -> ����
		var a = new ArrayList<String>(); // a�� ���ڿ��� �����ϰ� �˻��� �� �ִ� ArrayList ��ü�̴�.
		
		//�� �߰� -> �����̸�.add()
		arrayList.add("��ȯ");
		arrayList.add("����");
		arrayList.add("����");
		
		//���ϴ� ��ġ�� �� �߰�. -> ����
		arrayList.add(1, "�°�");
		
		
		//�� ���� -> .remove("�ε���")
		arrayList.remove(arrayList.size()-1); //4-1 = 3
		arrayList.remove(1);
		
		
		
		
		//arrayList ���
		//arrayList �� ũ�� -> size()
		for(int i = 0; i < arrayList.size(); i++) {
			//�� �������� -> .get(index)
			System.out.println(arrayList.get(i));
		}
			
	
	}

}
