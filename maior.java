import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextInt();
        if (n1 == n2) {
            System.out.println("FAVOR DIGITAR NUMEROS DISTINTOS!");
        } else
        if (n1 > n2) {
            System.out.println("O MAIOR NUMERO E: " + n1);
        } else {
            System.out.println("O MAIOR NUMERO E: " + n2);
        }
    }
}
