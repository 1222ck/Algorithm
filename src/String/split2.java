package String;

public class split2 {

	public static void main(String[] args) {
		String str1 = "Choi-Kwon-Henry";
		
		String[] arr1 = str1.split("-");  // 배열 만들때 타입 뒤에 [] 해줘야해
		
		for (int i = 0; i < arr1.length; i++) { // .length는 배열 길이 나타내는거임. ()는 없어도 됨
			System.out.println(arr1[i]);
		}
	}

}
