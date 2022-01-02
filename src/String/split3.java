package String;

public class split3 {

	public static void main(String[] args) {
		String str1 = "Choi-Kwon-Henry";
		
		String[] arr1 = str1.split("-", 3);
		System.out.println(arr1.length);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("name"+i+" = " + arr1[i]);
		}
	}

}
