class generic_class<T>{//T--> template that hold any data type which mention in object
    T x;
    public generic_class(T a){
        x=a;
    }
    public void max_value(){
      System.out.print(x);
    }

}
public class generic_class_practice {
    public static void main(String[] argv){
    generic_class<Integer> a=new generic_class<Integer>(10);
    a.max_value();
}

}
