public class TernarySearch {
    public int ternarySearch(int[] array, int data){
        int left = 0;
        int right =array.length-1;
        while(left<=right){
            int partition = (right-left)/3;
            int mid1=left+partition;
            int mid2=right-partition;
            if(array[mid1]==data)return mid1;
            if(array[mid2]==data) return mid2;
            if(data<array[mid1]) right=mid1-1;
            else if (data>array[mid2]) left = mid2+1;
            else {
                left=mid1+1;
                right=mid2-1;
            }
        }
        return -1;
    }
    public static int ternarySearchRecursive(int[] array, int data, int left, int right){
        if (left>right) return -1;
        int partition=(right-left)/3;
        int middle1 = left + partition;
        int middle2 = right - partition;
        if (array[middle1] == data) return middle1;
        if (array[middle2] == data) return middle2;
        if (data<array[middle1]) return ternarySearchRecursive(array,data, left, middle1-1);
        if(data>array[middle2]) return ternarySearchRecursive(array, data, middle2+1, right);
        else return ternarySearchRecursive(array, data, middle1+1, middle2-1);


    }
}
