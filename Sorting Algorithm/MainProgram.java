
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
     int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
//System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
//System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
//
//System.out.println(Arrays.toString(array));
//
//MainProgram.swap(array, 1, 0);
//System.out.println(Arrays.toString(array));
//
//MainProgram.swap(array, 0, 3);
//System.out.println(Arrays.toString(array));

MainProgram.sort(array);
    }
    
    public static int smallest(int[] array){
    
        int smallest = array[0];
        for(int search = 0; search<array.length; search++){
        
            if(smallest>array[search]){
            
                smallest = array[search];
            }
            
        }
        
        
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
    // write your code here
    
     int smallest= array[0];
     int smallestIndex = 0;
        for(int i = 0; i< array.length; i++){
        
            if(smallest>array[i]){
            
                smallest = array[i];
                smallestIndex = i;
            }
            
        }
        
        
        return smallestIndex;
    
}
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
    
    int smallest= table[startIndex];
     int smallestIndexFrom = startIndex;
        for(int i = startIndex; i< table.length; i++){
        
            if(smallest>table[i]){
            
                smallest = table[i];
                smallestIndexFrom = i;
            }
            
        }
        
        
        return smallestIndexFrom;
}
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
    
    int temp1 = array[index1];
    int temp2 = array[index2];
    array[index1] = temp2;
    array[index2] = temp1;
    
}
    
    public static void sort(int[] array){
    
       int i = 0;

        for(i = 0; i<array.length; i++){
         int small1 = indexOfSmallestFrom(array,i);
         swap(array,i,small1);
         System.out.println(Arrays.toString(array));
        }
        
        
    }
}
