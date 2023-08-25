import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o parametroUm: ");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o parametroDois: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e) {
            System.out.println(e);
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++) {
            System.out.println(String.format("Imprimindo o número: %d", i));
        }
    }
}
