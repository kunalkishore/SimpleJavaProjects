/**
 * Created by 16530 on 22/06/17.
 */
public class SinglyLinkedList<E> {
    private static class Node <E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
        public E getElement(){
            return this.element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next){
            this.next=next;
        }
    }

    private Node<E> head=null;
    private Node<E> tail =null;
    private int size=0;

    public SinglyLinkedList() {
    }
    public int getSize(){
        return size;
    }
    public E getFirst(){
        if (isEmpty())
                return null;
        return head.getElement();
    }
    public E getLast(){
        if (isEmpty())
            return null;
        return tail.getElement();
    }
    public boolean isEmpty(){
        return size==0 ;
    }
    public void addFirst(E element){
        head=new Node<>(element,null);
        if(isEmpty())
            tail=head;
        size++;
    }
    public void addLast(E element){
        if(isEmpty())
            addFirst(element);
        Node<E> newest = new Node<>(element,null);
        tail.setNext(newest);
        tail=newest;
        size++;
    }
    public void printList(){
        Node<E> temp= head;
        while(temp!=null){
            System.out.print(temp.getElement()+"-->");
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> ll = new SinglyLinkedList<String>();
        ll.addFirst("A");
        ll.addLast("B");
        ll.addLast("C");
        ll.addLast("D");
        ll.addLast("E");
        ll.printList();
    }
}
