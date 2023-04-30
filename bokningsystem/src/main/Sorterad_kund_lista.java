package main;

public class Sorterad_kund_lista{

	static String[] platser = Menu_functions.platser;
	static long[] sorteratID =new long[21];
	static String[] plats =new String[21];
	
	static void sortering() {
		for (int i = 0; i < platser.length; i++) {
			plats[i] = platser[i];
			
		}
		personnummer();
		kundsortering();
		
		
	}
	
	
	static void kundsortering() {
		
		
		// Sort the first array based on the positions of the IDs in the sorted array
		for (int i = 0; i < plats.length - 1; i++) {
		    for (int j = i + 1; j < plats.length; j++) {
		        long id1 = getId(plats[i]);
		        long id2 = getId(plats[j]);
		        long pos1 = -1;
		        long pos2 = -1;
		        for (int k = 0; k < sorteratID.length; k++) {
		            if (sorteratID[k] == id1) {
		                pos1 = k;
		            }
		            if (sorteratID[k] == id2) {
		                pos2 = k;
		            }
		        }
		        if (pos1 > pos2) {
		            // Swap elements i and j in the array
		            String temp = plats[i];
		            plats[i] = plats[j];
		            plats[j] = temp;
		        }
		    }
		 }
		for (String string : plats) {
			System.out.println(string);
		}
		
		}

		
		private static long getId(String s) {
		    return Long.parseLong(s.split("\\s")[s.split("\\s").length - 1].replaceAll("\\D", ""));
		}

		
		

	
	
	
	static void personnummer(){   	
	    	// merge sort
		
		 long[] array = new long[plats.length];
		
			for (int i = 0; i < array.length; i++) {
				
	    		String string = plats[i];
	    		
				array[i] = Long.parseLong(string.substring(string.indexOf("(")+1, string.indexOf(")")));
	    		
			}
		
	        mergeSort(array);
	        
	        for(int i = 0; i < array.length; i++){
	           sorteratID[i]=array[i];
	        }
	        
	        
	    }

		private static void mergeSort(long[] array) {
			
			int length = array.length;
			if (length <= 1) return; //base case
			
			int middle = length / 2;
			long[] leftArray = new long[middle];
			long[] rightArray = new long[length - middle];
			
			int i = 0; //left array
			int j = 0; //right array
			
			for(; i < length; i++) {
				if(i < middle) {
					leftArray[i] = array[i];
				}
				else {
					rightArray[j] = array[i];
					j++;
				}
			}
			mergeSort(leftArray);
			mergeSort(rightArray);
			merge(leftArray, rightArray, array);
		}
		
		private static void merge(long[] leftArray, long[] rightArray, long[] array) {
			
			int leftSize = array.length / 2;
			int rightSize = array.length - leftSize;
			int i = 0, l = 0, r = 0; //indices
			
			//check the conditions for merging
			while(l < leftSize && r < rightSize) {
				if(leftArray[l] < rightArray[r]) {
					array[i] = leftArray[l];
					i++;
					l++;
				}
				else {
					array[i] = rightArray[r];
					i++;
					r++;
				}
			}
			while(l < leftSize) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			while(r < rightSize) {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
}
