/*
 * Exercice 2 TD Collection                                                     26/02/2023
 *            Développé en TDD
 * 3IL Ingenieurs
 */
package exercice2;

/**
 * Test
 * @author Romain PALAYRET
 * @version 1.00
 */
public class TestFibo {


    /**
     *  Test n°1
     *  affiche les 5 premiers termes de la suite de Fibonacci
     *  (1,1,2,3,5)
     */
    public static void Test1() {
        for (Integer x : new Fibonacci(5))
            System.out.println(x);
    }

    /**
     * Lance tous les tests de la classe 1 par 1
     * @param args
     */
    public static void main(String[] args) {
        Test1();
    }
}
