public class ContaBanco extends Pessoa {
    private int numero;
    private String agencia;
    private Double saldo = 0.0;

    public ContaBanco(int numero, String agencia, String nomeCliente) {
        super(nomeCliente);
        this.numero = numero;
        this.agencia = agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, " +
            "sua agência é %s, conta %d e seu saldo %,.2f, " +
            "já está disponível para saque",
            this.nomeCliente, this.agencia, this.numero, this.saldo);
    }
}
