abstract class smartdevice{
    abstract void turnon();
    abstract void turnoff();
    void deviceinfo(){
        System.out.println("this is a smart device");
    }
}
class light extends smartdevice{
    @Override
    void turnon(){
        System.out.println("light is on");
    }
    @Override
    void turnoff(){
        System.out.println("light is off");
    }
}
interface remote{
    void change();
}
interface wificontrol{
    void connect();
}
class tv implements remote,wificontrol{
    @Override
    public void change(){
        System.out.println("change channel");
    }
    @Override
    public void connect(){
        System.out.println("connect to wifi");
    }
}
public class smart {
    public static void main(String[] args){
        // smartdevice device=new light();
        // device.turnon();
        // device.turnoff();
        // device.deviceinfo();
        remote r=new tv();
        r.change();
        wificontrol w=new tv();
        w.connect();
    }
}