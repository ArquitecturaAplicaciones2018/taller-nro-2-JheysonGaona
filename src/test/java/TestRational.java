import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRational {

    // Test de prueba unitaria para el método isLessThan
    @Test
    public void testIsLessThan() {
        Rational nuevo = new Rational(7,8);
        Rational nuevo2 = new Rational(4,6);
        assertEquals("", false, nuevo.isLessThan(nuevo2));
    }

    // Test de prueba unitaria para el método getGreater
    @Test
    public void testGetGreater() {
        Rational nuevo = new Rational(1,2);
        Rational nuevo2 = new Rational(3,5);
        assertEquals("", "3/5", nuevo.getGreater(nuevo2).toString());
    }

    // Test de prueba unitaria para el método plus
    @Test
    public void testPlus() {
        Rational nuevo = new Rational(3,7);
        Rational nuevo2 = new Rational(1,7);
        assertEquals("", "4/7", nuevo.plus(nuevo2).toString());
    }

    // Test de prueba unitaria para el método minus
    @Test
    public void testMinus() {
        Rational nuevo = new Rational(2,3);
        Rational nuevo2 = new Rational(3,5);
        assertEquals("", "1/15", nuevo.minus(nuevo2).toString());
    }

    // Test de prueba unitaria para el método times
    @Test
    public void testTimes() {
        Rational nuevo = new Rational(2,3);
        Rational nuevo2 = new Rational(1,4);
        assertEquals("", "1/6", nuevo.times(nuevo2).toString());
    }

    // Test de prueba unitaria para el método divides
    @Test
    public void testDivides() {
        Rational nuevo = new Rational(3,4);
        Rational nuevo2 = new Rational(4,5);
        assertEquals("", "15/16", nuevo.divides(nuevo2).toString());
    }
}
