/**
 * Created by hnastevska on 5/25/2017.
 */
public class SLLNode<E> {
    protected SLLNode<E> succ;
    protected E element;

    public SLLNode(E elem, SLLNode<E> succ) {
        this.element = elem;
        this.succ = succ;
    }
}
