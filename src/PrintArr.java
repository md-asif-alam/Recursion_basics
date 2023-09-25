public class PrintArr {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        dispArr(arr,0);
    }

    public static void dispArr(int[] arr,int idx){

        if(idx==arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        dispArr(arr,idx+1);

    }
}
