import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRational {

    // Test de prueba unitaria para el método isLessThan
    @Test
    public void testIsLessThan() {
        Rational nuevo = new Rational(7,8);
        Rational nuevo2 = new Rational(4,6);
        assertEquals("Se dice que 7/8 es menor que 4/6: ", false, nuevo.isLessThan(nuevo2));
    }

    // Test de prueba unitaria para el método getGreater
    @Test
    public void testGetGreater() {
        Rational nuevo = new Rational(1,2);
        Rational nuevo2 = new Rational(3,5);
        assertEquals("Se dice que 3/5 es mayor a 1/2: ", "3/5", nuevo.getGreater(nuevo2).toString());
    }

    // Test de prueba unitaria para el método plus
    @Test
    public void testPlus() {
        Rational nuevo = new Rational(3,7);
        Rational nuevo2 = new Rational(1,7);
        assertEquals("La suma de 3/7 + 1/7 es igual a 4/7: ", "4/7", nuevo.plus(nuevo2).toString());
    }

    // Test de prueba unitaria para el método minus
    @Test
    public void testMinus() {
        Rational nuevo = new Rational(2,3);
        Rational nuevo2 = new Rational(3,5);
        assertEquals("La resta de 2/3 - 3/5 es igual a 1/15: ", "1/15", nuevo.minus(nuevo2).toString());
    }

    // Test de prueba unitaria para el método times
    @Test
    public void testTimes() {
        Rational nuevo = new Rational(2,3);
        Rational nuevo2 = new Rational(1,4);
        assertEquals("El producto de 2/3 * 1/4 es igual a 1/6: ", "1/6", nuevo.times(nuevo2).toString());
    }

    // Test de prueba unitaria para el método divides
    @Test
    public void testDivides() {
        Rational nuevo = new Rational(3,4);
        Rational nuevo2 = new Rational(4,5);
        assertEquals("El cociente de 3/4 y 4/5 es igual a 15/16: ", "15/16", nuevo.divides(nuevo2).toString());
    }
}
