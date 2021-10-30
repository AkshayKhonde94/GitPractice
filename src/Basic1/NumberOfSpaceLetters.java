package Basic1;

public class NumberOfSpaceLetters {

	public static void main(String[] args) {
		String text= "Akshay1@^#&$^#2   Vijay Khonde";
		
		
		int spaces=0;
		int letters=0;
		int num=0;
		int special=0;
		
		
		char ch[] = text.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isLetter(ch[i])) {
				letters++;
			}else if(Character.isSpaceChar(ch[i])) {
				spaces++;
			}else {
				special++;
			}

		}
		
		
		
		System.out.println("spaces :" + spaces);
		System.out.println("letters :" + letters);
		System.out.println("num :" + num);
		System.out.println("special :" + special);
	}

}
