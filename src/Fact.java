import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
}
