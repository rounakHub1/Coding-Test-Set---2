package sum.prime;

public class algorithm {

    private int n, k;

    public void getNum(int n, int k) {
        this.n = n;
        this.k = k;
    }
    private boolean isPrime(int n) {

        for(int i=2; i<n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public boolean solve() {
        // Condition 1: Minimum sum of K primes is 2*K
        if (n < 2 * k) {
            return false;
        }

        // Case 2: K = 1, N must be prime
        if (k == 1) {
            return isPrime(n);
        }

        // Case 3: K = 2
        if (k == 2) {
            // If N is even, it's a sum of two primes (Goldbach's Conjecture)
            if (n % 2 == 0) {
                return true; 
            }
            // If N is odd, N = 2 + (N-2). So N-2 must be prime.
            return isPrime(n - 2);
        }

        // Case 4: K >= 3
        // If N >= 2K, it is always possible to represent N as sum of K primes.
        return true;
    }
}
