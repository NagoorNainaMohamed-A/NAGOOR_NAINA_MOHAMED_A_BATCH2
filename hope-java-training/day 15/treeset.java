import java.util.*;

public class treeset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        TreeSet<Integer> tr=new TreeSet<>();
        for(int i=0;i<n;i++)
        {   arr[i]=sc.nextInt();
            tr.add(arr[i]);
        }
        System.out.println("Enter the val:");
        int k=sc.nextInt();
        int left=tr.floor(k);
        int right=tr.ceiling(k);
        if(Math.abs(left-k)==Math.abs(right-k))
        {
            System.out.println(left+"  "+right);
        }
        else if(Math.abs(left-k)>Math.abs(right-k)){
            System.out.println(right);
        }
        else
        {
            System.out.println(left);
        }
    }
}
