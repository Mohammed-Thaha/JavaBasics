import java.util.Scanner;
public class generic_method {
    static <T> T[]  swap(T[] arr){
        T temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
        return arr;
    }
    public static void main(String[] argv){
       Scanner sc=new Scanner(System.in);
       String[] arr=new String[2];
       arr[0]=sc.nextLine();
       arr[1]=sc.nextLine();
       System.out.print("Before swap x and y "+arr[0]+" "+arr[1]+"\n");
       arr=swap(arr);
       System.out.print("Before swap x and y "+arr[0]+" "+arr[1]);
       sc.close();
    }
}
