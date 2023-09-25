public class PrintArrRev {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        dispArrRev(arr,0);
    }

    public static void dispArrRev(int[] arr, int idx)
    {
        if(idx==arr.length)
        {
            return;
        }
        dispArrRev(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
