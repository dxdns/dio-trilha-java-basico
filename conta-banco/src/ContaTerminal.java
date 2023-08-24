public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaBanco cc = new ContaBanco(1, "234", "test");
        System.out.println(cc.toString());
    }
}
