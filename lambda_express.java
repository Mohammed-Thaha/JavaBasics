interface sayable{
    public void say();
}
class lambda_express{
   public static void main(String[] argc){
       sayable s=()->{
        System.out.println("Hello");
       };
       s.say();
   }
}