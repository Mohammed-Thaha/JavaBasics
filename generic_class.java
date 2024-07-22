class GenericClass <T>{
       T x;
       public GenericClass(T t){
        x=t;
       }
       public void print_value(){
        System.out.print(x+"\n");
       }
}
public class generic_class {
   public static void main(String[] argv){
    GenericClass<String> a=new GenericClass<String>("java");
    GenericClass<Integer> b=new GenericClass<Integer>(123);
    a.print_value();
    b.print_value();
   }
    
}
