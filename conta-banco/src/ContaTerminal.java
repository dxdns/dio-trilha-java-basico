import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        System.out.println("Digite o valor a ser depositado na conta: ");
        Double valor = sc.nextDouble();

        int numero = getRandomNumber(1, 9999);

        ContaBanco cc = new ContaBanco(numero, agencia, nomeCliente);
        cc.depositar(valor);

        System.out.println(cc);

        sc.close();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
