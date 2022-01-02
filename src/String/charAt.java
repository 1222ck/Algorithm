package String;

public class charAt {
	public static void main(String[] args) {
		// 변수 선언
		String example = "안녕하세요";
//		char target1;
//		char target2;
//		char target3;
//		
//		target1 = example.charAt(0);
//		target2 = example.charAt(1);
//		target3 = example.charAt(3);
//		
//		System.out.println(target1);
//		System.out.println(target2);
//		System.out.println(target3);
		
		int exampleLength = example.length()-1;
		while (exampleLength >= 0) {
			char target;
			target = example.charAt(exampleLength);
			System.out.println(target);
			exampleLength--;
		}
	}

}
