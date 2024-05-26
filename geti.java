import java.util.*;
public class geti {
    public static int getithbit(int n , int i){
        int bitmask = 1<<i;
         if((n & bitmask) == 0){
            return 0;
         }
         else{
            return 1;
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("Enter your ith bit: ");
        int i = sc.nextInt();
        int result = getithbit(n, i);
        System.out.println(result);
    }
}
