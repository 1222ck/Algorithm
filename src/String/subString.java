package String;

public class subString {

	public static void main(String[] args) {
		String str1 = "ChoiKwon";
		String str2 = "  Choi  Kwon  ";
		
		System.out.println(str1.substring(0));
		System.out.println(str2.substring(0));
		System.out.println(str1.substring(0,8));
		System.out.println(str2.substring(2, 12));
	}

}
