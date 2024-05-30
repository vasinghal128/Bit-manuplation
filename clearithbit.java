import java.util.*;
public class clearithbit {
    public static int cleari(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updateith(int n , int i , int newbit){
        n = cleari(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("Enetr your ith bit: ");
        int i = sc.nextInt();
        System.out.print("Enter your 0 for clear enter 1 for set ");
        int newbit = sc.nextInt();
        int result = cleari(n, i);
        int update = updateith(n, i, newbit);
        System.out.println(result);
        System.out.println("After update value "+update);
        }
}
