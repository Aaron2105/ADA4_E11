public class LinkList<E extends Comparable<? super E>> {
    private Link<E> first;
    
    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(E dd) { 
        Link<E> newLink = new Link<E>(dd);
        newLink.setNext(first); 
        first = newLink;
    }

    public void insertLast(E dd){
        Link<E> current = first;
        if(isEmpty()){
            insertFirst(dd);
        }else{
            while(current != null) { 
                if(current.getNext() == null){
                    Link<E> newLink = new Link<E>(dd);
                    current.setNext(newLink);
                    current = null;
                }else
                    current = current.getNext();
            }
        }
    }

    public Link<E> deleteFirst() {
        Link<E> temp=null; 
        if(!isEmpty()){
            temp = first;
            first = first.getNext();
        }
        return temp; 
    }

    public Link<E> deleteLast() {
        Link<E> temp = null;
        Link<E> current = first;
        if(isEmpty()||current.getNext()==null){
            temp = deleteFirst();
        } else {
            while(current != null) {
                if(current.getNext().getNext() == null){
                    temp = current.getNext();
                    current.setNext(null);
                    current = null;
                } else
                    current = current.getNext(); 
            }
        }
        return temp; 
    }

    public void displayList() {
        System.out.print("List (first--> ");
        Link<E> current = first;
        while(current != null) {
            current.displayLink(); 
            current = current.getNext(); 
        }
        System.out.println("<--last)");
    }

    public Link<E> find(E dd){
        Link<E> current = first;
        if(!isEmpty()){
            while(current != null) {
                if(current.getdData().compareTo(dd)==0)
                    return current;
                current = current.getNext();
            }
        }
        return null;
    }

    public void findDelete(E dd){
        Link<E> current = first;
        if(!isEmpty()){
            if(current.getNext() == null){
                if(current.getdData().compareTo(dd) == 0)
                    first = null;
                return;                
            }
            if(current.getdData().compareTo(dd)==0){
                first = current.getNext();
                return;
            }
            while(current != null) {
                if(current.getNext() != null){
                    if(current.getNext().getdData().compareTo(dd) == 0){
                        current.setNext(current.getNext().getNext());
                        return;
                    }
                }
                current = current.getNext();
            }
        }
        return;
    }

    public void deleteAt (int index){
        Link<E> current = first;
        int cont = 0;
        if(isEmpty())
            return;
        if(index == cont){
            first = current.getNext();
            return;
        }
        while(current != null){
            if(cont == index -1){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
            cont++;
        }
    }

    public Link<E> find(int pos){
        Link<E> current = first;
        int cont = 0;
        while(current != null){
            if(cont == pos)
                return current;
            current = current.getNext();
            cont++;
        }
        return null;
    }

    public int findPosition(E dd){
        Link<E> current = first;
        int cont = 0;
        while(current != null){
            if(current.getdData() == dd)
                return cont;
            current = current.getNext();
            cont++;
        }
        return -1;
    }

    public int size(){
        Link<E> current = first;
        int cont = 0;
        while(current != null){
            current = current.getNext();
            cont++;
        }
        return cont;
    }

    public E getElementAt(int index){
        Link<E> current = first;
        int cont = 0;
        while(current != null){
            if(cont == index)
                return current.getdData();
            current = current.getNext();
            cont++;
        }
        return null;
    }

    public Link<E> getFirst(){
        return first;
    }

    public Link<E> getLast(){
        Link<E> current = first;
        if(isEmpty())
            return null;
        while(current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }

    public void clear(){
        first = null;
    }

}