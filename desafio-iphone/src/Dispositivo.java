abstract class Dispositivo {
    protected String modelo;
    protected boolean ligado = false;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
}
