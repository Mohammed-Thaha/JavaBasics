class generic_method<T>{
   public T display_data(T x){
        return x;
   } 
}
class generic_method2{
   public static void main(String[] argv){
    generic_method<String> obj=new generic_method<String>();
    System.out.print(obj.display_data("Thaha\n"));
    generic_method<Integer> obj1=new generic_method<Integer>();
    System.out.print(obj1.display_data(12));
   }
}