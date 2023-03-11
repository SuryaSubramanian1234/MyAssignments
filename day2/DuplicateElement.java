package week1.day2;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int arr[] = {11, 22, 3, 7, 22, 7, 9, 8, 3};

	        System.out.println("Duplicate elements in given array: ");  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  

	}

}
