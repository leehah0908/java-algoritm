package recursive;

public class Basic {
    public static void recursive(int n) {
        if (n == 0) return;
        recursive(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        recursive(3);
        System.out.println("\n==========");
        System.out.println(factorial(10));
    }
}
