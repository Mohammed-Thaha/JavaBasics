import java.util.Scanner;
public class string_manipulation {
   public static void main(String[] argv){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println("Enter String:"+str);
    System.out.print("The length of the give string is "+str.length());
    sc.close();
   }
    
}
