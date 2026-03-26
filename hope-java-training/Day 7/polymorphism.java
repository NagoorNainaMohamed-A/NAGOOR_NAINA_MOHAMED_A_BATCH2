class Sample{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class polymorphism {
    public static void main(String[] args)
    {
        int a=10,b=5,c=67;
        Sample s=new Sample();
        System.out.println(s.add(a,b,c));
        System.out.println(s.add(b,c));
    }
}
