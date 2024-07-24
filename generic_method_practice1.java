class template<T>{
    T val;
    template(T x){
        this.val=x;
    }
    void display(){
        System.out.print(val+"\n");
    }
}
public class generic_method_practice1 {
    
    public static void main(String[] argv){
        template<String> obj1=new template<String>("Thaha");
        obj1.display();
        template<Integer> obj2=new template<Integer>(177);
        obj2.display();
        template<Character> obj3=new template<Character>('c');
        obj3.display();
    }
}
