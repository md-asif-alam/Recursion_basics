import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        int res = linearPower(x,n);
        System.out.println(res);

    }

    public static int linearPower(int x, int n)
    {
        if(n==0)
            return 1;
        return x*linearPower(x,n-1);
    }
}
