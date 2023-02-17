public class Link<E> {
    private E dData;
    private Link<E> next; 

    public Link(E dd) {
        dData = dd;
        next = null;
    }

    public E getdData() {
        return dData;
    }

    public Link<E> getNext() {
        return next;
    }

    public void setdData(E dData) {
        this.dData = dData;
    }
    
    public void setNext(Link<E> next) {
        this.next = next;
    }

    public void displayLink() {
        System.out.print("{" + dData.toString() + "} ");
    }

}