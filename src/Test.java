/*

*/
/*Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
        Output:   3->2->1->4->5->6->9->8->7->NULL.*//*


class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class Test {
public int size;
public Node head=null;
public Node tail=null;

public void addNode(int data)
{
    Node newNode= new Node (data);
    if(head==null)
    {
        head=newNode;
        tail
    }
}
}
*/
