class notification
{   String name;
    String message;
    void send()
    {
        System.out.println("notification sent");
    }
    notification(String inp_name , String inp_message)
    {
        this.name=inp_name;
        this.message=inp_message;
        System.out.println("notification created");
    }
}
class emailnotification extends notification
{
    void changeemail()
    {
        System.out.println("email changed");
    }
        emailnotification(String inp_name , String inp_message)
        {
            super(inp_name,inp_message);
        }
        @Override
        void send()
        {
            System.out.println("email sent"+name);
            System.out.println("message is "+message);
        }
}
class smsnotification extends notification
{
         smsnotification(String inp_name , String inp_message)
        {
            super(inp_name,inp_message);
        }
        @Override
        void send()
        {
            System.out.println("sms sent "+name);
            System.out.println("message is "+message);
        }
}
public class notify
{
    public static void main(String[] args)
    {
        // notification n;
        // emailnotification n1=new emailnotification();
        // notification n2=new smsnotification();
        // n= new emailnotification("Nagoor", "Hello"); 
        // n.send();
        // n1.send();
        // n2.send();
        // n1.changeemail(); // This will cause a compile-time error because the reference type is notification, which does not have the changeemail() method.
    notification[] n={new emailnotification("test","orderconfirmed"),new smsnotification("test2","OTP" )};
    for(notification a:n)
        a.send();
    }
}
