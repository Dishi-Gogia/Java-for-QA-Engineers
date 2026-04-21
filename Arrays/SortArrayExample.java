package Arrays;

import java.util.Arrays;

public class SortArrayExample {
	
	public static void main(String[] args) {

        int[] numbers = {50, 10, 40, 20, 30};

        Arrays.sort(numbers);

        System.out.println("Sorted Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        
        //OR
        int[] num = {50, 10, 40, 20, 30};
        int temp;
        for(int i=0;i<num.length;i++) {
        	for(int j=i+1;j<num.length;j++) {
        		        	
        	if(num[i] > num[j]) {
        		temp=num[i];
        		num[i] = num[j];
        		num[j]=temp;
        	}
        }
        	System.out.print(num[i] + " ");
        }
        
    }

}
