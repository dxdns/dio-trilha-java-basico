import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // get customer name
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        // get agency number
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        // deposit amount in the account
        System.out.println("Digite o valor a ser depositado na conta: ");
        Double valor = sc.nextDouble();

        // generate account number
        int numero = getRandomNumber(1, 9999);

        ContaBanco cc = new ContaBanco(numero, agencia, nomeCliente);
        cc.depositar(valor);

        System.out.println(cc);
        
        sc.close();
    }

    /**
     * 
     * @param min min value
     * @param max max value
     * @return int random number
     */
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
