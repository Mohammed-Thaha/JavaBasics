import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Integer Number:");
        int num=sc.nextInt();
        System.out.print("Enter the float Number:");
        float decimal=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the string value:");
        String sentences=sc.nextLine();
        System.out.print("Enter boolean value:");
        boolean true_false=sc.nextBoolean();
        System.out.print(num+"\n");
        System.out.print(decimal+"\n");
        System.out.print(true_false+"\n");
        System.out.print(sentences);
        sc.close();
    }
}
