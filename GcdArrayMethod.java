import java.util.Scanner;
public class GcdArrayMethod {
   public static void main(String s[]){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[] arr_m=new int[m];
    int[] arr_n=new int[n];
    
    for(int i=1;i<m;i++){
        if((m%i)==0){
        arr_m[i]=i;
        }
    }
    for(int i=1;i<n;i++){
        if((n%i)==0){
        arr_n[i]=i;
        }
    }
    for(int am:arr_m){
        for(int bn:arr_n){
            if(am==bn){
                System.out.print(am);
            }
        }
    }
    sc.close();
   }

}