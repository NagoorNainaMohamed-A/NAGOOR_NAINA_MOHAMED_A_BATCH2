import java.util.*;
public class Alist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,5,6));
        Collections.sort(list);
        int len=list.size();
        for(int i=0;i<len-1;i++){
            // if(list.get(i)%2==0){
            //     list.remove(i);
            //     i--;    
            //     len--;
            // }
            if(list.get(i)==list.get(i+1))
            {
                list.remove(i);
                i--;
                len--;
            }  
    }
System.out.println(list);
}
}