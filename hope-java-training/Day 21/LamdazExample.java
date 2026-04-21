@FunctionalInterface
interface Math {
int add(int a,int b);
// int sub(int a,int b);
    
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}
public class LamdazExample{
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args)
    {
        // Math obj=(a,b)->a+b;
        // instead of below code we can use this which makes it simple
        // Math obj=new Math() {
        //     @Override
        //     public int add(int a,int b){
        //         return a+b;
        //     }
        // };
        Math obj=(a,b)->{
            System.out.println("Adding two numers" );
            return a+b; 
        }
        Exercise obj1=()->System.out.println("Hello world");
        obj1.sayHello();
        System.out.println(add(22,33));
    }
}
//for using lambda function the interface should have only one method 