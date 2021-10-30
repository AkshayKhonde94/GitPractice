package Basic1;

import java.util.Scanner;

public class multiplicatiobTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(number*i);
		}

	}

}
