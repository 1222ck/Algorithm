package String;

public class indexOf {

	public static void main(String[] args) {
		String str1 = "ChoiKwon";
		String str2 = "  Choi   Kwon  ";
		
		System.out.println(str1.indexOf("o")); // 첫번째 o의 index를 반환
		System.out.println(str2.indexOf("o")); // 공백을 포함하여 첫번째 o의 index를 반환
		System.out.println(str1.indexOf("x")); // "x"는 str1에 없는 문자이기 때문에 -1을 반환한다.
		
		System.out.println(str1.indexOf("o", 3)); // 두번째 o의 index를 반환
		System.out.println(str2.indexOf("o", 5)); // 공백을 포함하여 두번째 o의 index를 반환
	}

}
