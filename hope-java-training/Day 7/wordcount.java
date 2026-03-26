import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int count=0;
        boolean isWord=false;
        int len=ch.length;
        for(int i=0;i<len;i++)
        {
            if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))
            {
                i++;
                isWord=true;
                if(i<len && !((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')))
                {
                    count++;
                }
            }
           
        }
        if(isWord==true)
        {
            count+=1;
        }
        System.out.println(count);

    }
}