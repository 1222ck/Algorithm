package String;

public class split2 {

	public static void main(String[] args) {
		String str1 = "Choi-Kwon-Henry";
		
		String[] arr1 = str1.split("-");  // �迭 ���鶧 Ÿ�� �ڿ� [] �������
		
		for (int i = 0; i < arr1.length; i++) { // .length�� �迭 ���� ��Ÿ���°���. ()�� ��� ��
			System.out.println(arr1[i]);
		}
	}

}
