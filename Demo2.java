package srinath;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ramu";
		// RAMU
		
		char ch = name.charAt(0);
		int diff = (int)('d'-'D');
		
		diff = diff<0?-1 * diff:diff;
		
		if(ch >='a' && ch <='z') {
			ch = (char)(ch -diff);
		}
		System.out.println(ch);
		
	

	}

}
