package fibo;
import java.util.Iterator;

class Fibonacci implements Iterable<Integer>{
    int borne;
    public Fibonacci (int borne){
        this.borne = borne;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new FiboIterator(borne);
    }

}
