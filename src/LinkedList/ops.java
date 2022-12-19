package LinkedList;

public class ops {


    public static void main(String[] args)
    {
        node head = new node(10);
        for(int i = 0; i<10; i++)
        {
                node newNode = new node(i*10+1);
                newNode.addAtTail(head,newNode);

            //for addAtTail catch the new head address and update main head
//            head = newNode.addAtHead(head,newNode);

        }

        head.display(head);

        node newNode = new node(1000*10+1);
        newNode.addAtPos(head,2,newNode);

        System.out.println("-------------------------------");
        head.display(head);

        head = head.deleteHead(head);
        head.display(head);

        head.deleteAtPos(head,1);
        head.display(head);
    }


}
