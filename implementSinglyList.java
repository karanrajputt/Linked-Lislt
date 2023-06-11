import java.util.LinkedList;

public class implementSinglyList {
    Node head=null;
    Node tail=null;
     class Node{
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
           public  void addList(int data)
           {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
           }
           public void display()
           {
            Node cur=head;
            if(head==null) return ;
            System.out.println("singly linked list\n:");
            while(cur!=null)
            {
                System.out.print(cur.data);
                cur=cur.next;
            }
            //System.out.println();
           }
           
    public static void main(String[] args) {
        implementSinglyList list= new implementSinglyList();

        list.addList(1);
        list.addList(2);
        list.addList(5);
        
        list.display();
    }
}
