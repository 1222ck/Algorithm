package String;

public class startsWith {

	public static void main(String[] args) {
		String str1 = "ChoiKwon";
		String str2 = "  Choi  Kwon  ";
		
		System.out.println(str1.startsWith("Ch"));
		System.out.println(str1.endsWith("on"));
		System.out.println(str2.startsWith("Ch")); // str2�� �������� �����ؼ� false
		System.out.println(str2.endsWith("on")); // str2�� �������� ������ false
	}

}
