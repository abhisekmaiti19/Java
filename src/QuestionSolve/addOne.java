package QuestionSolve;
import java.util.*;
import java.lang.*;
import java.io.*;

public class addOne {

    static class LinkedList{
        private class node{
            int data;
            node next;
        }
        private node head;
        private int size;
        private node tail;

        public void Dispaly(){
            node temp = this.head;
            while(temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }
        public void addFirst(int data)
        {
            node newNode = new node();
            newNode.data = data;
            if(this.head == null)
            {
                this.head = newNode;
                newNode.next = null;
            }
            else
            {
                newNode.next = this.head;
                this.head = newNode;
            }
        }

    }
    public class Main
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            LinkedList List1  = new LinkedList();
            for(int i = 0; i< 10 ; i++)
            {
                List1.addFirst(i*10);
            }
            List1.Dispaly();
        }
    }

}



