package String;

public class split {

	public static void main(String[] args) {
		String str1 = "Choi-Kwon-Henry";
		String str2 = "Choi Kwon Henry";
		
		String[] arr1 = str1.split("-");
		String[] arr2 = str2.split(" ");
		
		String name1 = arr1[0];
		String name2 = arr1[1];
		String name3 = arr1[2];
		
		System.out.println("name1 = " + name1);
		System.out.println("name2 = " + name2);
		System.out.println("name3 = " + name3);
		System.out.println("Full name = " + name1 + name2 + name3);
	}

}
