package LinkedList;
import java.util.*;

public class node {

    int data;
    node next;


    node(int data)
    {
        this.data = data;
        this.next = null;
    }
    node (int data, node next)
    {
        this.data = data;
        this.next = next;
    }

    //default
    node()
    {
        this.data = 0;
         this.next = null;
    }

    public node addAtHead(node head, node newNode)
    {
        newNode.next = head;
        head = newNode;

        return head;

    }

//    H->11->12;
    public void addAtTail(node head, node newNode)
    {
        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = null;
    }

    public void addAtPos(node head,int pos, node newNode)
    {


        //step1
        node temp = head;
        int count = 1;

        //step2
        while(count != pos)
        {
            temp = temp.next;
            count++;
        }

        node tempNext = temp.next;
        temp.next = newNode;
        newNode.next = tempNext;

    }


    //delete
    public node deleteHead(node head)
    {
            head = head.next;

            return head;
    }

    public void deleteAtPos(node head,int pos)
    {
        node temp = head;
        int count = 1;

        //step2
        while(count != pos)
        {
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
    }
    public void display(node head)
    {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ---> ");

            temp  = temp.next;

        }

        System.out.println("null");
    }

}
