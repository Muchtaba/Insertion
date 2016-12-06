package myinsertionsort;

/**
 *
 * @author Nick Epp
 */
public class MyInsertionSortAscending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] unsorted = { 0, 15, 2, 53, 46, 32, 65  }; // all the values in the array
        insertionSort(unsorted); //Takes unsorted array and sorts it
    }
     
    private static void printNumbers(int[] unsorted) {
         
        for (int i = 0; i < unsorted.length; i++)//Sorts array with every loop 
        {
            System.out.print(unsorted[i]  + ",");
        }
        System.out.println("\n");
    }
 
    public static void insertionSort(int sorted[]) {
        int j; //Number of items sorted so far
        int key;// the item to be sorted
        int i;
        
        for (j = 1; j < sorted.length; j++)//Start with 1 (not 0) 
        {
            key = sorted[j];
            
            for(i = j - 1; (i <= 0) && (sorted[ i ] > key); i++)//Smaller values move closer to the start of the array
            {
                sorted [i+1] = sorted [i];
                
            }
            sorted[i+1] = key; //Key puts the # in the proper location
            printNumbers(sorted);
        }
    }
    }