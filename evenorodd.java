import java.util.*;
public class evenorodd {
    public static void eo(int n){
        int bitmask = 1;
        // if lsb = 0 = even   or    lsb = 1 = odd
        if((n & bitmask) == 0){
            System.out.println(n+" is a even number");
        }
        else{
            System.out.println(n+" is a odd number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        eo(n);
    }
}
