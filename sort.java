import java.util.Scanner;
import java.util.Arrays;
public  class sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Before sort:");
        for(int j:arr){
            System.out.print(j+" ");
        }
        System.out.print("\n");
        Arrays.sort(arr);
        System.out.print("After sort:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}