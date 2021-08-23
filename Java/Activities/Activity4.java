package activities;

public class Activity4 {

	public static void main(String[] args) {

		int[] numArray = {4,3,2,10,12,1,5,6};
		
		System.out.print("Array before Sorting : [");
		for (int i=0; i<numArray.length;i++)
		{
			System.out.print(numArray[i]+ " ");
			
		}
		System.out.print("]");
		
		insertionSort(numArray);
		System.out.println("Array After Sorting : [");
		for (int i=0; i<numArray.length;i++)
		{
			System.out.print(numArray[i]+ " ");
			
		}
		System.out.print("]");
		
		
	}
	
	public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int i = 1; i < n; i++) {  
            int num = array[i];  
            int j = i-1;  
            while ( (j >=0) && ( array[j] > num ) ) {  
                array [j+1] = array [j];  
                j--;  
            }  
            array[j+1] = num; 
        }
	}

}
