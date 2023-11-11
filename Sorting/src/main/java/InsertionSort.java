public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int toBeInserted = array[i]; // temporary variable for toBeInserted
            int j = i-1; // predecessor
            while(j>=0 && array[j]>toBeInserted){ //start shifting operation here
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeInserted;
        }
        return array;
    }
}
