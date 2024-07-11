class method{
    int a,b,c;
    void get_data(){
        a=10;
        b=5;
    }
    void process_data(){
        c=a+b;
    }
    void display_data(){
        System.out.print(c);
    }
    public static void main(String[] args) {
     method obj=new method();
     obj.get_data();
     obj.process_data();
     obj.display_data();   
    }
}