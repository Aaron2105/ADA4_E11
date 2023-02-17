public class LinkListApp {
    public static void main(String args[]) {
        LinkList<Double> ll = new LinkList<Double>();
        ll.insertLast(1.0);
        ll.insertLast(2.0);
        ll.insertFirst(3.0);
        ll.insertLast(4.0);
        ll.insertLast(5.0);
        System.out.println(ll.size());
        ll.displayList();
        ll.deleteAt(2);
        ll.displayList();
        ll.findDelete(3.0);
        ll.displayList();
        ll.deleteLast();
        ll.displayList();
    }
}
