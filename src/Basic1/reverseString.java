package Basic1;

public class reverseString {

	public static void main(String[] args) {
		String s1="Hi Hello How Are You";
		
		String reversedString="";


		for(int i=s1.length()-1;i>=0;i--) {
			reversedString += s1.charAt(i);
		}
		
		System.out.println(reversedString);

	}

}
