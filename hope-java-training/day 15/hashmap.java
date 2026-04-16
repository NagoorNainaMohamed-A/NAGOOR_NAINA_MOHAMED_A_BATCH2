import java.util.*;
class hashmap{
    public static void main(String[] args)
   {
    int[] arr={1,2,3,3,4,5};  
Map<Integer, Integer> hm=new HashMap<>();
    // for(int i=0;i<arr.length;i++)
    // {
    //     hm.put(i,arr[i]);
    // }

    // for(Map.Entry<Integer, Integer> entry : hm.entrySet())
    // {
    //     System.out.println(entry.getKey() + " " + entry.getValue());
    // }
    for(int i=0;i<arr.length;i++)
    {
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }
    for(Map.Entry<Integer, Integer> entry : hm.entrySet())
     {
         System.out.println(entry.getKey() + " " + entry.getValue());
     }
   
}
   
}