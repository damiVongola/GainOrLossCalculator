/*
 * Realization of a FIFO queue as an adaptation  of a DoublyLinkedList
 * 
 */

/**
 * Name: Aleshinloye Damilola
 * StudNo: 3050957
 * @param <E>
 */
public class DoublyLinkedQueue<E> implements Queue<E>{
    private DoublyLinkedList<E> list=new DoublyLinkedList<>(); // an empty list
    
    public DoublyLinkedQueue(){}   //new queue relies on the initially empty list
    public int size(){return list.size();}
    public boolean isEmpty(){return list.isEmpty();}
    public void enqueue(E element){list.addLast(element);}
    public E first(){return list.first();}
    public E dequeue(){return list.removeFirst();}
    
}
