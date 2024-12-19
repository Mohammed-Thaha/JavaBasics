import java.util.*;
public class ForEach_loop {
    public static void main(String[] argv){
        List<Integer> l=new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            if(i%2==0){
                l.add(i);
            }
        }
        l.forEach((i)->System.out.println(i));

    }
}
