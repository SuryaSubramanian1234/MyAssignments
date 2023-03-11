package week1.day2.copy;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int myArray1[] = {1, 2, 3, 5, 6};
	      
	      //Array does not have duplicate element + Should have range of values
	      //1+2+3+5+6 = 17
	      //1+2+3+4+5+6 = 21
	      int sumArrayValue = 0;
	        for(int i = 0; i < myArray1.length; i++) {  
	        	sumArrayValue = sumArrayValue+myArray1[i];
	        }
	        System.out.println(sumArrayValue);

	        int sumSecondValue = 0;
	        for(int j = 0; j <=6; j++) {  
	        	sumSecondValue = sumSecondValue+j;
	        }
	        System.out.println(sumSecondValue);
	        System.out.println("result========" +(sumSecondValue-sumArrayValue));


	}

}
