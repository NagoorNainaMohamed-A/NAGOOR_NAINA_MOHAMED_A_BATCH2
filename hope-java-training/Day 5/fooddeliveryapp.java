class User{
   String name;
   String address;
   String phoneNumber;
   String email;
   User(){
   System.out.println("User class created");
   }
}
class FoodUser extends User{
   
   String foodmenu;
   FoodUser(){
   System.out.println("FoodUser class created");
}}
class TravelUser extends User{
   
   String travelpackage;
    TravelUser(){
        System.out.println("TravelUser class created");
}}
class Driver extends User{
    
    String role="driver";
    Driver(){
        System.out.println("Driver class created");
}
}
public class fooddeliveryapp {
   public static void main(String[] args)
   {
    User user = new User();    
    FoodUser foodUser = new FoodUser();
        TravelUser travelUser = new TravelUser(); 
         Driver driver = new Driver();

   } 
}
