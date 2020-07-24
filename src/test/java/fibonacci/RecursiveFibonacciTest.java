package fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;


public class RecursiveFibonacciTest {

    private RecursiveFibonacci fibo = new RecursiveFibonacci();

    @Test
    public void testFibonacciOfMinus1() throws IllegalArgumentException{
        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> {fibo.fibonacci(-1);}
        );
        assertEquals("n cannot be negative!", error.getMessage());
    }

    @Test
    public void testFibonacciOf0(){
        long result = fibo.fibonacci(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciOf1(){
        long result = fibo.fibonacci(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibonacciOf2(){
        long result = fibo.fibonacci(2);
        assertEquals(1, result);
    }

    @Test
    public void testFibonacciOf10(){
        long result = fibo.fibonacci(10);
        assertEquals(55, result);
    }

    @Test
    public void testFibonacciOf50(){
        long result = fibo.fibonacci(50);
        assertEquals(12586269025L, result);
    }
}
