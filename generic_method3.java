class swap<T> {
    void swap_any_value(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
        System.out.print(x+" "+y);
    }
}
public class generic_method3 {
    public static void main(String[] argv) {
        swap<String> obj = new swap<String>();
        String a = "Thaha";
        String b = "Mohammed";
        obj.swap_any_value(a,b);
        swap<Integer> obj1=new swap<Integer>();
        Integer n1=10;
        Integer n2=5;
        obj1.swap_any_value(n1,n2);
    }
}
