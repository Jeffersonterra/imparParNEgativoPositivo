
import java.util.Scanner;

class A {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        double x;
        int N = leitor.nextInt();
        // Digite quantas entradas queres que ele faca e ele dira se eh positivo
        // negativo ou nulo, impar ou par
        for (int i = 0; i < N; i++) {
            x = leitor.nextDouble();
            if (x == 0) {
                System.out.println("NULL");
            } else {
                if (x % 2 == 0) {
                    System.out.printf("EVEN ");
                } else {
                    System.out.printf("ODD ");
                }

                if (x < 0) {
                    System.out.println("NEGATIVE");
                }
                if (x > 0) {
                    System.out.println("POSITIVE");
                }
            }
        }
        leitor.close();
    }
}
