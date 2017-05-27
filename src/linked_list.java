//A class for a node of linked list.
class Node
{
    int key;
    Node next;
    Node(int key)
    {
        this.key=key;
        next=null;
    }
}
public class linked_list {
    Node root=null;
    linked_list()
    {
         root =new Node(4);
        push(new Node(3));
        push(new Node(4));
        push(new Node(4));
       // print(root);
        palindrome(root);
    }
    //To add a node infront of the list i.e. to push the node
    void push(Node n)
    {   n.next=root;
        root=n;
        
    }
    Node reverse(Node head)
    {
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            //System.out.println("Hel");
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        print(prev);
        return prev;
    }
   void palindrome(Node head)
    {
        String original="";
        Node temp1=head;
        while(temp1!=null)
        {
            original+=temp1.key;
            temp1=temp1.next;
        }
        String reversed="";
        Node temp2=reverse(head);
        while(temp2!=null)
        {
            reversed+=temp2.key;
            temp2=temp2.next;
        }
        if(original.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Non Palindrome");
    }
    void print(Node r)
    {
        Node temp=r;
        //A loop from head to end of the linkked list.
        while(temp!=null)
        {
            System.out.println(temp.key);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        new linked_list();
    }
}
