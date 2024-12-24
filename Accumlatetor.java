package srinath;

public class Accumlatetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =88888,r,sum=0;
		while (num != 0){
			r=num%10;
			num=num/10;
			sum=sum=r;
			if (num==0){
				if (sum>10){
					num=sum;
					sum=0;
				}
			}
		}
System.out.println("sum--->"+sum);
	}

}
