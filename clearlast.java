import java.util.*;
public class clearlast {
    public static int clearlastith(int n, int i){
        int bitmask = -1<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("Enter your ith bit: ");
        int i = sc.nextInt();
        int result = clearlastith(n,i);
        System.out.println(result);
    }
}
