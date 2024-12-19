interface Logic {
    public int add(int a, int b);
}

public class Additon {
    public static void main(String[] a){
        Logic l=(a1,b1)->(a1+b1);
        System.out.println(l.add(10, 10));

    }
}
