public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(array,5));
        System.out.println(binarySearchRecursive(array,5));
    }
    public static int binarySearch(int[] array, int data){
        int left =0;
        int right =array.length-1;

        while(left<=right){
            int middle = (left+right)/2;
            if(array[middle]==data) return middle;
            if(array[middle]<data) left =middle+1;
            else right= middle-1;
        }
        return -1;

    }
    public static int binarySearchRecursive(int [] array,int data){
        return binarySearchRecursive(array,data,0,array.length-1);
    }
    public static int binarySearchRecursive(int[] array, int data, int left, int right){
        if(left>right) return -1;
        int middle =(left+right)/2;
        if(array[middle]==data) return middle;
        if(array[middle]<data) return binarySearchRecursive(array,data,middle+1,right);
        else return binarySearchRecursive(array,data,left,middle-1);
    }
}
