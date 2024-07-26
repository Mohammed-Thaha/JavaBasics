import java.util.Scanner;
public class recursion_practice_problem {
    static void print_without_loop(int numbers){
        if(numbers<=0){
            return;
        }
        print_without_loop(numbers-1);
        System.out.print(numbers+" ");
    }
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_without_loop(n);
        sc.close();
    }
}
