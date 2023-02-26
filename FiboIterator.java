/*
 * Exercice 2 TD Collection                                                     26/02/2023
 *            Développé en TDD
 * 3IL Ingenieurs
 */
package fibo;

import java.util.Iterator;

/**
 * Iterator de la classe Fibonacci
 * @author Romain PALAYRET
 * @version 1.00
 */
public class FiboIterator implements Iterator<Integer> {

    /**
     * Constructeur de l'itérateur de la classe Fibonacci
     * @param borne la borne max jusqu'à laquelle il est possible d'Itérer
     */
    public FiboIterator(int borne) {

    }

    /**
     * @return true s'il est possible de continuer d'iterer
     */
    @Override
    public boolean hasNext() {
        return true;
    }

    /**
     * Itère la collection de 1
     * @return l'Integer suivant
     */
    @Override
    public Integer next() {
        return null;
    }
}
