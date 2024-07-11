import java.util.Arrays;
import java.util.Scanner;
class panagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[26];
        String str=sc.nextLine();
        System.out.print(str);
        Arrays.fill(arr,0);
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            int index=(int)temp-97;
            arr[index]++;
            index=0;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
