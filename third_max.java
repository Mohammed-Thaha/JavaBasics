import java.util.Scanner;
public class third_max {
    public static int max_value_array(int[] arr,int n){
      long first_max=Long.MIN_VALUE;
      long second_max=Long.MIN_VALUE;
      long third_max=Long.MIN_VALUE;
       for(int val:arr){
        if(val>first_max){
            third_max=second_max;
            second_max=first_max;
            first_max=val;
        }else if(val>second_max && val<first_max){
            third_max=second_max;
            second_max=val;
        }else if(val>third_max && val<second_max){
            third_max=val;
        }
       }
      int return_value=(third_max==Long.MIN_VALUE) ? (int)first_max : (int)third_max;
      return return_value;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=max_value_array(arr,n);
        System.out.print(result);
        sc.close();
    }
}
