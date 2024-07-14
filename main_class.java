import java.util.Scanner;
class max_min_method{
    int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    int min(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
public class main_class{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    max_min_method obj=new max_min_method();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int max_value=obj.max(a,b);
    int min_value=obj.min(a,b);
    System.out.print("The largest value:"+max_value);
    System.out.print("\nThe smallest value:"+min_value);
    sc.close();
}
}
