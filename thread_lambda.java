public class thread_lambda {
    public static void main(String[] argv){
        //without lambda
        Runnable r1=new Runnable(){
          public void run(){
            System.out.println("Hello from Thread 1");
          }  
        };
        Thread t1=new Thread(r1);
        t1.start();
        //with lambda
        Runnable r2=()->{
                System.out.println("Hello from Thread 2");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
