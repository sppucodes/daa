public class FibonacciRecursive {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change the value of n as needed
        System.out.println("Fibonacci Series using Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

//non re
public class FibonacciNonRecursive {

    public static void fibonacci(int n) {
        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        System.out.println("Fibonacci Series without Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(series[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change the value of n as needed
        fibonacci(n);
    }
}

without re:
static void fibonaciiSeries(int N){

        int n1 = 0;
        int n2 = 1;

        // System.out.println(n1);
        // System.out.println(n2);

        int itr1 = 0;

        for(int i=1;i<=N;i++){
            System.out.println(n1);
            int c1 = n1 +n2;
            n1 = n2;
            n2 = c1;

            itr1++;
        }

        // System.out.println("Iterations: "+itr1);
    }

    public static void main(String[] args) {
        
         fibonaciiSeries(10);

        // fibonaciiSeriesRecusrisve(10);

       // fibonaciiSeriesRecusrisve(10);
    }
}
