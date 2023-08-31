public class Program {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.ligar();

        iphone.selecionarMusica("Journey: Don't Stop Believin");
        iphone.tocar();
        iphone.pausar();

        iphone.adicionarNovaAba("aba1");
        iphone.adicionarNovaAba("aba2");
        iphone.atualizarPagina(1);
        iphone.exibirPagina(1);

        iphone.iniciarChamada();
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

        System.out.println(iphone);
    }
}
