package String;

public class indexOf {

	public static void main(String[] args) {
		String str1 = "ChoiKwon";
		String str2 = "  Choi   Kwon  ";
		
		System.out.println(str1.indexOf("o")); // ù��° o�� index�� ��ȯ
		System.out.println(str2.indexOf("o")); // ������ �����Ͽ� ù��° o�� index�� ��ȯ
		System.out.println(str1.indexOf("x")); // "x"�� str1�� ���� �����̱� ������ -1�� ��ȯ�Ѵ�.
		
		System.out.println(str1.indexOf("o", 3)); // �ι�° o�� index�� ��ȯ
		System.out.println(str2.indexOf("o", 5)); // ������ �����Ͽ� �ι�° o�� index�� ��ȯ
	}

}
