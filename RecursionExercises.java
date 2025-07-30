public class RecursionExercises {
    public static void main(String[] args) throws Exception {
        System.out.println(MultiplicationTwoNaturalNumberBySuccessiveAdditionRecursive(6, 4));
        System.out.println(SumTwoNaturalNumberBySuccessiveAdditionRecursive(2, 3));
        System.out.println(sumTailHelper(2, 3, 0));
        System.out.println(HarmonicAverage(2));
        System.out.println(StringInversion("gato"));
        System.out.println(f(3));
    }

    // 1
    public static int MultiplicationTwoNaturalNumberBySuccessiveAdditionRecursive(int n, int m) throws Exception {
        if (n < 0 || m < 0) {
            throw new Exception("Numbers must be natural numbers");
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        return m + MultiplicationTwoNaturalNumberBySuccessiveAdditionRecursive(n - 1, m);
    }

    // 2
    public static int SumTwoNaturalNumberBySuccessiveAdditionRecursive(int n, int m) throws Exception {
        if (n < 0 || m < 0) {
            throw new Exception("Numbers must be natural numbers");
        }
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }

        return 1 + SumTwoNaturalNumberBySuccessiveAdditionRecursive(n, m - 1);
    }

    // 2.1 Tail Recursion
    public static int sumTailHelper(int n, int m, int acc) {
        if (m == 0) {
            return n + acc;
        }
        return sumTailHelper(n, m - 1, acc + 1); // <- última instrução
    }

    // 3
    public static double HarmonicAverage(double n) throws Exception {

        if (n == 0)
            throw new Exception("Number must be natural numbers");
        if (n == 1)
            return 1;

        return 1 / n + HarmonicAverage(n - 1);
    }

    //4
    public static String StringInversion(String s) throws Exception {
        if (s == null) {
            throw new Exception("The String must be not null");
        }
        if (s.length() == 1) {
            return s;
        }

        char last = s.charAt(s.length()-1);
        String rest = s.substring(0, s.length() - 1);

        return last + StringInversion(rest);
    }

    /*
        * Gerador da sequência dada por:
        * F(1) = 1
        * F(2) = 2
        * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
     */

    public static double f(double n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return 2 * f(n-1) + 3 * f(n - 2);
    } 
}
