import java.util.*;
public class countsetbits {
    public static int countbits(int n){
        int count =0;
        while(n>0){
            if((n & 1) != 0){ // check lsb 0 or 1
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int result = countbits(n);
        System.out.println(result);
    }
}
