class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtStart(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertatpos(int data,int pos)
    {   int loc =pos;
        Node newNode=new Node(data);
        Node temp=head;// 1 2 3 4 5 6 
        for(int i=1;i<loc-1;i++)
        {
            if(temp!=null)
            {
              temp=temp.next;
            }
            else
            {
                System.out.println("invalid position");
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;

        }
    public void deletestart()
    {   if(head!=null){
        Node temp=head;
        head=head.next;
    }
    else{
        System.out.println("the node is empty");
    }
    }
    public void deleteend()
    {
        if(head!=null)
        {
            Node temp=head;
            Node prev=head;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Linked{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtStart(5);
        list.insertAtStart(4);
        list.insertAtStart(3);
        list.insertAtStart(2);
        // list.display();
        list.deletestart();
        list.deleteend();
        list.display();
        list.insertatpos(10,0);
        list.display();
    }
}