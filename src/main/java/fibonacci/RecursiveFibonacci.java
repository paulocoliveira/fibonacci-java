package fibonacci;

public class RecursiveFibonacci {

    public RecursiveFibonacci() {
    }

    public long fibonacci(int n){
        if (n < 0){
            throw new IllegalArgumentException("n cannot be negative!");
        }else if (n < 2){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
