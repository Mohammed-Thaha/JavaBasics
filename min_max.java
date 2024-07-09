import java.util.Scanner;
public class min_max {
    public static void main(String[] args){
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<10;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
         
        System.out.print("The largest Element in an Array:"+max+"\n");
        System.out.print("The smallest Element in an Array:"+min+"\n");
        sc.close(); 
    }
}
