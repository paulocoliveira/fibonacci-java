package fibonacci;

public class InteractiveFibonacci {

    public InteractiveFibonacci() {
    }

    public long fibonacci(int n){
        long current = 0;
        long previous = 0;

        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative!");
        }else{
            for(int i = 1; i <= n; i++){
                if (i == 1) {
                    current = 1;
                    previous = 0;
                } else{
                    current += previous;
                    previous = current - previous;
                }
            }
            return current;
        }
    }

}
