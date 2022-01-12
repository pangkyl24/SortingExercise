public class SortingAlgorithms {
  
  //fork and make your own version
    //final int SIZE = 10;
    private int[] arr = {5, 4, 6, 7, 9, 1, 3, 2, 10, 8};
    
    /*public void setArr(int[] array){
		arr = array;
		for(int i = 0; i < arrMain.length; i++){
			System.out.print(" " + arrMain[i]);
		}
		System.out.println();
	}
	public SortingAlgorithms(){
		
		//arr = new int[SIZE];
	
		
	}*/
	private void printArr(int[] array){
		for(int i = 0; i < array.length; i++){		
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	private int[] deepCopy(int[] in){
		
		int[] out = new int[in.length];
		for(int i = 0; i < in.length; i++){
			out[i] = in[i];
		}
		return out;
		
	}
	
	public void bubbleSort(){
		
		int[] array = deepCopy(arr);
	
		int count = 1;
		int swaps = 0;
		int temp;
		
		while(count != 0){
			count = 0;
			for(int i = 0; i < array.length-1; i++){
				if(array[i] > array[i+1]){
					temp = array[i];
					array[i]=array[i+1];
					array[i+1] = temp;
					count++;
					swaps++;
					//printArr(array);
				}
				
			}
			
		}
		
		System.out.println(swaps);
	}
	
	public void insertionSort(){
		
		int[] array = deepCopy(arr);
		int swaps = 0;
		int num;
		int j;
		
		
		for(int i = 1; i < array.length; i++){
			num  = array[i];
			j = i;
			while(j > 0 && array[j-1] > num){
				array[j] = array[j-1];
				j-=1;
				swaps++;
				//printArr(array);
			}
			array[j] = num;
			
		}
		
		System.out.println(swaps);

	}
	
	public void selectionSort(){
		
		int[] array = deepCopy(arr);
		//int[] arr = arrMain;
		int swaps = 0;
		int min;
		int temp;
		
		
		for(int i = 0; i < array.length-1; i++){
			min = i;
			for(int j = i; j < array.length; j++){
				if (array[j] < array[min]){
					min = j;
				}
			}
			if(min != i){
				temp = array[min];
				array[min] = array[i];
				array[i] = temp;
				swaps++;
				//printArr(array);
			}
			
		}
		System.out.println(swaps);
		
		
	}

  
}

