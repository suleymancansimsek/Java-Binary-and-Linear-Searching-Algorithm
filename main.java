package lab_9;

public class main {
	
	//Binary Search Algorithm
	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   int visitingNumber = 0;
		   while( first <= last ){  
			   visitingNumber++;
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println(visitingNumber + " elements are visited. " + "Value is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Value is not found!");  
		   }  
		 }  
	  
	 //Linear Search Algorithm
	  public static int linearSearch(int[] arr, int key){ 
	
	        for(int i=0;i<arr.length;i++){
	        	
	            if(arr[i] == key){    
	                return i;    
	            }    
	        }    
	        return -1;    
	    }    
	 
		 public static void main(String args[]){  
			 
		        int arr[] = {5, 11, 17, 22, 36, 43, 62, 71, 83, 97};  //our list
		        
		        int key = 71;  //Our value that we search for
		        
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,key);
		        
		        System.out.println( (linearSearch(arr, key)+1)  + " elements are visited. " + "Value is found at index: "+linearSearch(arr, key));  
		 }

}
