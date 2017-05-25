/**
 * Created by hnastevska on 5/25/2017.
 */
public class MyList<E> {
    private SLLNode<E> first;

    public MyList() {
        this.first = null;
    }

    public void insertFirst(E o) {
        SLLNode<E> node = new SLLNode<E>(o, this.first);
        this.first = node;
    }

    public void insertAfter(E o, SLLNode<E> after) throws Exception {
        if (after != null) {
            SLLNode<E> node = new SLLNode<E>(o, after.succ);
            after.succ = node;
        } else throw new Exception();
    }

    public void insertBefore(E o, SLLNode<E> before) throws Exception {
        if (first != null) {
            SLLNode<E> tmp = first;
            if (first == before) {
                this.insertFirst(o);
                return;
            }
            while (tmp.succ != before)
                tmp = tmp.succ;
            if (tmp.succ == before) {
                SLLNode<E> ins = new SLLNode<E>(o, before);
                tmp.succ = ins;
            }
        }
    }

    public E deleteFirst() throws Exception {
        if (first != null) {
            SLLNode<E> tmp = first;
            first = first.succ;
            return tmp.element;
        } else throw new Exception();

    }

    public void delete(SLLNode<E> node) throws Exception {
        if (node != null) {
            if (node == first) {
                deleteFirst();
            }
            SLLNode<E> tmp = first;
            while (tmp.succ != node) {
                if (tmp.succ == node) {
                    tmp.succ = tmp.succ.succ;
                }
                tmp = tmp.succ;
            }
        }

    }

    public SLLNode<E> getFirst() {
        return first;

    }
}
