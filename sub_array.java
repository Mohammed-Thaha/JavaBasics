import java.util.Scanner;
class sub_array{
    public static void main(String[] argc){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               for(int z=i;z<=j;z++){
                System.out.print(arr[z]);
               }
               System.out.print("\n");
            }
           
        }
        sc.close();
    }
}