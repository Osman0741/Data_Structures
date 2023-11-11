public class QuickSort {
    public static void quickSort(int[] array, int start, int end){
        if(start>=end) return; // termination
        int boundary = partition(array,start,end);
        quickSort(array,start, boundary-1);//call quickSort for left part
        quickSort(array,boundary+1,end); // call quickSort for right part
    }
    public static int partition(int[] array,int start,int end){
        int pivot =  array[end];
        int boundary = start;
        for (int i = start; i <=end ; i++) {
            if(array[i]<=pivot) swap(array,i,boundary++);
        }
        return boundary-1;
    }
    public static void swap(int[] array, int idx1, int idx2){
        int temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]=temp;
    }
}
