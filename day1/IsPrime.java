package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =13;
		int count =0;
		for(int i=2; i<num; i++) {
			if(num%i ==0) {
				count++;
			}
		}	
		if(count>0) {
			System.out.println(num+"Given number is not a prime number");

		}else {
			System.out.println(num +  "Given number is prime number");

}

}
}
