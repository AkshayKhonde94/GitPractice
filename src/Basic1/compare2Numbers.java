package Basic1;

public class compare2Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a>b);
		//a>b?System.out.println("a>b"):System.out.println("b>a");;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(a==b) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is less than b");
		}
	}
}
