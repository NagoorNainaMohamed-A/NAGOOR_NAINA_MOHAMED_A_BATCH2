public class compiletimeexception {
    public static void main(String[] args) {
        try{
            System.out.println("thread sleep");
            Thread.sleep(6000);
            System.out.println("thread wake up");
        }
        catch(InterrptedException e){
            System.out.println("sleep interrupted");
        }
    }
}