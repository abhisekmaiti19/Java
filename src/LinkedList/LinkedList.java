package LinkedList;

public class LinkedList {

    private class node{
        int data; //default value 0
        node next; // default value null;
    }
    private node head;
    private node tail;
    private int size;


    public void display( )
    {
        node temp = this.head;
        while(temp != null)
        {
            System.out.print( temp.data +" -> ");
            temp = temp.next;
        }
    }
    public void addLast(int data)
    {
        // create a new node
        node nn = new node();
        nn.data = data;
        nn.next = null;

        // attatch
        if(this.size>= 1)
        {
            this.tail.next = nn;

        }

        if (this.size == 0)
        {
            this.head = nn;
            this.tail = nn;
            this.size ++;
        }else
        {
          this.tail = nn;
          this.size ++;
        }

    }
    public void addFirst(int data)
    {
        node nn = new node();
        nn.data = data;
        nn.next = null;

        if(this.size == 0)
        {
            this.head = nn;
            this.tail = nn;
            this.size++;
        }

        if(this.size>=1)
        {
            nn.next = head;
            this.head = nn;
            this.size++;
        }
    }
    public int getFirst() throws Exception {

        if(this.size == 0) {

            throw new Exception("Dang !! you are not allowed ");
        }

        return this.head.data;

    }

    public int getLast() throws Exception {

        if(this.size == 0) {

            throw new Exception("Dang !! you are not allowed ");
        }

        return this.tail.data;

    }

    public int getAt(int index) throws Exception {

        if(this.size == 0) {

            throw new Exception("Dang !! you are not allowed ");
        }

        if(index > this.size || index<0)
        {
            throw new Exception ("Dannnnnggg !! invalid index");
        }

        int count = 0;
        node temp = this.head;
        while(temp != null)
        {
            if(count == index)
            {
                break;
            }
            temp = temp.next;
            count++;
        }

        return temp.data;

    }

    private node getNodeAt(int index) throws Exception {

        if(this.size == 0) {

            throw new Exception("Dang !! you are not allowed ");
        }

        if(index > this.size || index<0)
        {
            throw new Exception ("Dannnnnggg !! invalid index");
        }

        int count = 0;
        node temp = this.head;
        while(temp != null)
        {
            if(count == index)
            {
                break;
            }
            temp = temp.next;
            count++;
        }

        return temp;

    }

    public void addAt(int index, int data) throws Exception{

        if(index <0 || index> this.size)
        {
            throw new Exception("invalid index !!");

        }

        if(index == 0)
        {
            addFirst(data);
        }else if(index == this.size)
        {
            addLast(data);

        }else
        {
            node prev = getNodeAt(index-1);
            node after = getNodeAt(index);
            node nn = new node();
            nn.data = data;
            prev.next = nn;
            nn.next = after;

        }
    }

    public void removeFirst() throws Exception{


        if(this.size == 0)
        {
            throw new Exception("Linked List is empty");

        }
        this.head = this.head.next;
        this.size--;

    }

    public void removeLst() throws Exception{

        if(this.size == 0)
        {
            throw new Exception ("Size is empty");
        }
        if(this.size == 1)
        {
            this.head = null;
            this.tail = null;
            this.head.data = 0;
            this.size--;
        }
        else
        {
            node secLast = getNodeAt(size-2);
            secLast.next = null;
            this.tail = secLast;
            this.size --;
        }

    }

    public void removeAt(int index) throws Exception
    {
        if(this.size == 0)
        {
            throw new Exception("Linked list is Empty");
        }


        if(index > this.size || index <0)
        {
            throw new Exception("Invalid index");
        }
        else if(index == 0)
        {
            removeFirst();
        }
        else if(index == (this.size-1))
        {
            removeLst();
        }
        else
        {
            node getNode = getNodeAt(index-1);
            node prev= getNode;
            node after = prev.next.next;
            prev.next = after;
            this.size--;
        }



    }
    public void pointerRev()
    {
        node prev = this.head;
        node curr = prev.next;

        while(curr != null )
        {
            node ahead  = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;

        }

        node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        this.tail.next = null;
        display();


    }
    public void reverse() throws Exception {
          int left = 0;
          int right = this.size -1;

          while(left < right)
          {
              node lft = getNodeAt(left);
              node rght = getNodeAt(right);
              int temp = lft.data;
              lft.data = rght.data;
              rght.data = temp;
              left++;
              right--;
          }
    }

    public int mid()
    {
        node slow = this.head;
        node fast = this.head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

}
