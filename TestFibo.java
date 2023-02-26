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
}
