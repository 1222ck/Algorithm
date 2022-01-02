package String;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		UniqueEmailAddress a = new UniqueEmailAddress();
		String[] emails = {
				"test.email+james@coding.com",
				"test.e.mail+toto.jane@coding.com",
				"testeamil_tom@cod.ing.com"};
		System.out.println(a.solve_1(emails));
		System.out.println(a.solve_substring(emails));
		System.out.println(a.solve_split(emails));
		}
	
	public int solve_1(String[] emails) {
		
		// TODO Auto-generated method stub

	}

}
