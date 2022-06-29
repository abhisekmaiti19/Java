package LinkedList;

public class client {
    public static void main(String [] args) throws Exception
    {

        LinkedList list = new LinkedList();
//        list.getFirst();
        for(int i = 0;i <=20;i++)
        {
            if(i>10)
            {
                list.addFirst(i*10);
            }
            else
            {
                list.addLast(i*10);
            }

        }
        list.display();
        System.out.println();
        list.addAt(10,1111001111);
        list.display();
        System.out.println();
        list.removeAt(0);
        list.display();
        System.out.println();
        list.reverse();
        list.display();

        LinkedList list2 = new LinkedList();
        for(int i = 0; i<3;i++)
        {
            list2.addLast(i*11);
        }
//        System.out.println();
//        list2.display();
//        list2.reverse();
//        System.out.println();
//        list2.display();

        System.out.println();
        list2.display();
        System.out.println();
        list2.pointerRev();
//        list2.display();
//        System.out.println(list2.getAt(4));
        System.out.println();
        System.out.println(list2.mid());



//        System.out.println(list.getAt(2));




    }

}
