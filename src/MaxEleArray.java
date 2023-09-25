import java.util.Scanner;

public class MaxEleArray {

    public static void main(String[] args) {
        int[] arr={10,2,8,11,9,7};

        int max=maxElement(arr,0);
        System.out.println(max);
    }

    public static int maxElement(int arr[], int idx)
    {
        if(idx==arr.length-1)
            return arr[idx];
        int misa=maxElement(arr,idx+1);
        if(misa>arr[idx])
        {
            return misa;
        }else {
            return arr[idx];
        }
    }
}
