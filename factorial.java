import java.util.Scanner;
public class factorial {
    static int factorial_recursion(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*factorial_recursion(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factorial_recursion(n);
        System.out.print(fact);
        sc.close();
    }
}
