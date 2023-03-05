package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secNum =1;
		int sum;
		int length = 11;
		
		for(int i=1; i<=length; i++) {
			System.out.println(firstNum);
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}
	}
}


