/*
 * Exercice 2 TD Collection                                                     26/02/2023
 *            Développé en TDD
 * 3IL Ingenieurs
 */
package fibo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test la class FiboIterator puis Fibonacci
 * @author Romain PALAYRET
 * @version 1.00
 */
public class TestFibonacci {


    /**
     *  Test n°1
     *  FiboIterator.hasNext() renvoie true car la borne max est à 5
     */
    @Test
    public void Test1() {
        assertEquals(true, (new FiboIterator(5)).hasNext());
    }

    /**
     *  Test n°2
     *  FiboIterator.hasNext() renvoie false car la borne max est à 0
     */
    @Test
    public void Test2() {
        assertEquals(false, (new FiboIterator(0)).hasNext());
    }

    /**
     *  Test n°3
     *  FiboIterator.hasNext() renvoie false car on atteind la borne après un next()
     *
     */
    @Test
    public void Test3() {
        FiboIterator it = new FiboIterator(1);
        it.next();
        assertEquals(false, it.hasNext());
    }
    
    /**
     *  Test n°4
     *  FiboIterator.next() renvoie 1 la première valeur de la suite de fibo est 1
     */
    @Test
    public void Test4() {
        FiboIterator it = new FiboIterator(1);
        assertEquals(1, it.next());
    }
    
    
    /**
     *  Test n°5
     *  FiboIterator.next()  4 fois renvoie 3 la 4ème valeur de la suite de fibo est 3
     */
    @Test
    public void Test5() {
        FiboIterator it = new FiboIterator(10);
        it.next();
        it.next();
        it.next();
        assertEquals(3, it.next());
    }
}
