class game{
    public String name;
    game(String name)
    {
        this.name=name;
    }
    void attack()
    {
        System.out.println("attack");
    }
}
class warrior extends game{
    warrior(String name)
    {
        super(name);
    }
        void attack()
        {
            System.out.println(name+" Attack with sword");
        }
}
class archer extends game{
    archer(String name)
    {
        super(name);
    }   
    void attack()
    {
        System.out.println(name+" Attack with arrow");
    }

}
class mage extends game{
    mage(String name)
    {
        super(name);
    }   
    void attack()
    {
        System.out.println(name+" Attack with magic");
    }

}
public class minigame{
    public static void main(String[]args){
   game g;
   g=new warrior("Nagoor");
   g.attack();
   g=new archer("Nagoor");
   g.attack();
   g=new mage("Nagoor");
   g.attack();


    }

}