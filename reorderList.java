public class reorderList {    
       static class Node{
            int data;
            Node next;
           
        }
    
        static Node reorder(Node head)
        {
            if(head==null) return null;
            Node prev=head;
            Node curr=head.next;
            while(curr!=null)
            {
                if(prev.data>curr.data){
                    int t=prev.data;
                    prev.data=curr.data;
                    curr.data=t;
                }
                if(curr.next!=null&& curr.next.data>curr.data)
                {
                       int t=curr.next.data;
                       curr.next.data=curr.data;
                       curr.data=t;
                }
                prev=curr.next;
                if(curr.next==null)  break;
                curr=curr.next.next;
            }
            return head;
        }
    
        static  Node addList(Node head,int k)
               {
                Node newNode=new Node();
                newNode.data=k;
                newNode.next=head;
                head=newNode;
                return head;
               }
              static void display(Node head)
               {
                Node cur=head;
                if(head==null) return ;
                while(cur!=null)
                {
                    System.out.print(cur.data+" ");
                    cur=cur.next;
                }}
    
                public static void main(String[] args) {
         Node head=null;    
                  head=addList(head,1);
                  head=addList(head,2); 
                  head=addList(head,3);
                  head=addList(head,4);
                  head=addList(head,5); 
                  head=addList(head,6);
                    
                    //display();
                       head=reorder(head);
                    display(head);
                }
    }
    
    

