import java.util.*;
class waveform{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<len;i++)
        {
           if(i%2==0)
           {
            sb1.append(str.charAt(i));
           }
           else{
            sb2.append(str.charAt(i));
           }
           
        }
        
        
        System.out.println(sb1.append(sb2));
    } 
}