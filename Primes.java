
public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);

        boolean[] primenums = new boolean[N + 1];
        int counter = 0;

      
        for (int i = 2; i <= N; i++) {
            primenums[i] = true;
        }
//אלגוריתם של המדען
        for (int p = 2; p * p <= N; p++) {
            if (primenums[p]) {
                // Mark multiples of p as non-prime
                for (int i = p * p; i <= N; i += p) {
                    primenums[i] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (primenums[i]) {
                System.out.println(i);
                counter++;
            }
        }

  
        int percentage = (int) Math.round((double) (counter * 100) / N);
        System.out.println("There are " + counter + " primes between 2 and " + N + " (" + percentage + "% are primes)");
    }
}
