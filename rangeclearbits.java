import java.util.*;
public class rangeclearbits {
    public static int clearibits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n = sc.nextInt();
    System.out.print("Enter the valur of i: ");
    int i = sc.nextInt();
    System.out.print("Enter the value of j: ");
    int j = sc.nextInt();
    int result = clearibits(n,i,j);
    System.out.println(result);
}
}
