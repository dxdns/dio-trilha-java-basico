import java.util.HashMap;
import java.util.Map;

public class Iphone extends Dispositivo implements ReprodutorMusical, Telefone, NavegadorInternet {
    private String musica;
    private boolean tocando = false;
    private Map<Integer, String> abas;

    public Iphone() {
        super("iphone");
        abas = new HashMap<>();
    }

    public void iniciarChamada() {
        System.out.println("Chamada iniciada.");
    }

    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void adicionarNovaAba(String url) {
        Integer numeroPagina = abas.size() + 1;
        abas.put(numeroPagina, url);
        System.out.println(String.format("Aba: %s adicionada", numeroPagina));
    }

    public void atualizarPagina(Integer numeroPagina) {
        String aba = abas.get(numeroPagina);
        if(aba == null) {
            throw new Error("Aba não encontrada.");
        }
        System.out.println(String.format("Página atualizada: %s", aba));
    }

    public void exibirPagina(Integer numeroPagina) {
        System.out.println(String.format("Página exibida: %s", abas.get(numeroPagina)));
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
    }

    public void tocar() {
        if(musica == null) {
            throw new Error("selecione uma música");
        }
        tocando = true;
    }

    public void pausar() {
        tocando = false;
    }

    @Override
    public String toString() {
        return String.format("%s %s %nReprodutorMusical: [%s: %s]",
                this.modelo, this.ligado? "ligado": "desligado",
                this.musica, this.tocando ? "tocando" : "musica pausada");
    }
}
