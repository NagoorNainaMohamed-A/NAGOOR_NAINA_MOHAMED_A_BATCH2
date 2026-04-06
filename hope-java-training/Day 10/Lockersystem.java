class locker{
    private int lockerid;
    private int pin;
    private boolean islocked;
    private String item;
    locker(int lockerid,int pin){
        this.lockerid=lockerid;
        this.pin=pin;
        this.islocked=true;
    }
    public void storeitem(String item,int pin){
        if(this.pin==pin){
            if(!islocked){
                this.item=item;
            }
            else{
                System.out.println("locker is locked");
            }
        }
        else{ System.out.println("invalid pin");}
    }
    public void retrieveitem(int pin){
        if(this.pin==pin){
            if(!islocked && item!=null){
                System.out.println("retrieved item: "+item);
                item=null;
            }
            else{
                System.out.println("locker is locked or no item to retrieve");
            }
        }
        else{ System.out.println("invalid pin");}
    }
    public void lock(){
        islocked=true;
    }
    public void unlock(int pin){
        if(this.pin==pin){
            islocked=false;
        }
        else{ System.out.println("invalid pin");}
    }
}
class Locksystem{
    public static void main(String[] args) {
        locker l=new locker(100,1234);
        // l.unlock(1234);
        l.storeitem("laptop", 1234);
        l.lock();
        l.unlock(1234);
        l.retrieveitem(1234);
        l.retrieveitem(1373);
    }
}