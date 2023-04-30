package main;

public class vinnst {
	static String[] platser = Menu_functions.platser;
	static String[] plats =new String[21];
	static long[] sorteratID =new long[21];
	
	
	public static void beräkning() {
		
		
		

		 int countUnder18 = 0;
	        int count18to50 = 0;
	        int countOver50 = 0;

	        for (long bd : sorteratID) {
	            int year = (int)(bd / 100000000L); // extract the year (yy) from the birth date
	            int age = 0;

	            if (year <= 23) { 
	                age = 2021 - (2000 + year); 
	            } else {
	                age = 2021 - (1900 + year); 
	            }

	            if (age < 18) {
	                countUnder18++; // increment the count of people under 18
	            } else if (age < 50) {
	                count18to50++; // increment the count of people between 18 and 50
	            } else {
	                countOver50++; // increment the count of people over 50
	            }
	        }
	        double vinnst =0;
	        
	        //<18
	        for(int i=0; i<countUnder18 ;i++) {
	        	vinnst+=149.90;
	        }
	        for(int i=0; i<count18to50 ;i++) {
	        	vinnst+=299.90;
	        }
	        for(int i=0; i<countOver50 ;i++) {
	        	vinnst+=200;
	        }
	        
	        int vinsten = ((int)vinnst)*10;
	        
	        vinnst = ((double)vinsten)/10;
	        
	        System.out.println("vinnst är " +vinnst+"kr");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void sortering() { 	
		
		for (int i = 0; i < platser.length; i++) {
			plats[i] = platser[i];
			
		}
	
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

		
		
		
		
	

