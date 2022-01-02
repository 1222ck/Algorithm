package String;

public class lastIndexof {

	public static void main(String[] args) {
		String str1 = "ChoiKwon";
		String str2 = "  Choi  Kwon  ";
		
		System.out.println(str1.lastIndexOf("o"));
		System.out.println(str1.lastIndexOf("o", 5));
		System.out.println(str1.lastIndexOf("x"));
		System.out.println(str2.lastIndexOf("o"));
		System.out.println(str2.lastIndexOf("o", 8));
	}

}
