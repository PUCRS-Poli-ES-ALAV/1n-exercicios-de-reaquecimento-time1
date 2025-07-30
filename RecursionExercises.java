public class RecursionExercises {
    public static void main(String[] args) throws Exception {
        System.out.println(MultiplicationTwoNaturalNumberBySuccessiveAdditionRecursive(6, 4));
        System.out.println(SumTwoNaturalNumberBySuccessiveAdditionRecursive(2, 3));
        System.out.println(sumTailHelper(2, 3, 0));
        System.out.println(HarmonicAverage(2));
    }

    public static int MultiplicationTwoNaturalNumberBySuccessiveAdditionRecursive(int n, int m) throws Exception {
        if (n < 0 || m < 0) {
            throw new Exception("Numbers must be natural numbers");
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        return m + MultiplicationTwoNaturalNumberBySuccessiveAdditionRecursive(n - 1, m);
    }

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

    public static int sumTailHelper(int n, int m, int acc) {
        if (m == 0) {
            return n + acc;
        }
        return sumTailHelper(n, m - 1, acc + 1); // <- última instrução
    }

    public static double HarmonicAverage(double n) throws Exception {

        if (n == 0)
            throw new Exception("Numer must be natural numbers");
        if (n == 1)
            return 1;

        return 1 + HarmonicAverage(1 / (n-1));
    }

}
