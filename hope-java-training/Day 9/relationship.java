class battery{
    void powersupply(){
        System.out.println("still have 40% power");
    }
}
class remote{
    battery minibattery=new battery();
    remote(){
        minibattery=new battery(); 
    }
    public void changechannel(){
        minibattery.powersupply();
        System.out.println("channel changed");
    }
     public void changevolume(){
        System.out.println("volume increased");
        
    }
}
class tv{
    remote tvremote;
    tv(remote tvremote){
        this.tvremote=tvremote;
    }
    public void increasevolume(){
        tvremote.changevolume();
    }
}
public class relationship{
    public static void main(String[] args){
        // remote tvremote=new remote();
        // tvremote.changechannel();
    }
}