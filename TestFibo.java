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
     *  FiboIterator.hasNext() renvoie true
     */

    @Test
    public void Test1() {
        assertEquals(true, (new FiboIterator(5)).hasNext());
    }
}
