import java.util.*;
class mobile{
    int id;
    String name;
    float price;
    public mobile(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class stream_filter {
    public static void main(String[] argv){
        List<mobile> details=new ArrayList<mobile>();
        details.add(new mobile(1,"Vivo",20000f));
        details.add(new mobile(1,"Samsung",10000f));
        details.add(new mobile(1,"Apple",50000f));//just dummy data guy's
        details.stream().filter(p->p.price>10000).map(pm->pm.price).forEach(System.out::println);
    }

}

