import java.util.*;
public class powerof2 {
    public static boolean ispoweroftwo(int n){
        return ((n)&(n-1))==0;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       System.out.println(ispoweroftwo(n));
    }
}
