public class flatteningList {
    Node head=null;
    class Node{
        int data;
        Node next;
        Node right;
        Node down;
        Node (int data)
        {
            this.data=data;
            this.next=null;
            this.right=null;
            this.down=null;
        }}
        Node merge(Node  a,Node b)
        {
            if(a==null)  return b;
            if(b==null)  return a;
            if(a.data<b.data)
            {
                a.next=merge(a.next,b);
                return a;
            }
            else{
                b.next=merge(a,b.next);
                return b;
            }
        }
    public  Node addList(Node head,int data)
           {
            Node newNode=new Node(data);
            newNode.down=head;
            head=newNode;
            return head;
           }
           public void display()
           {
            Node cur=head;
            if(head==null) return ;
          //  System.out.println("singly linked list\n:");
            while(cur!=null)
            {
                System.out.print(cur.data);
                cur=cur.next;
            }}
            Node flatten(Node root)
            {
                if(root==null) return root;
                root.right=flatten(root.right);
                root=merge(root,root.right);
                return root;
            }
            public static void main(String[] args) {
                flatteningList list= new flatteningList();
              list.head=list.addList(list.head,5);
              list.head=list.addList(list.head,2);
              list.head=list.addList(list.head,5);
              list.head.right=list.addList(list.head.right,90);
              list.head.right=list.addList(list.head.right,89);
              list.head.right.right=list.addList(list.head.right.right,78);
              list.display();
              list.head=list.flatten(list.head);
                
                list.display();
            }
}
