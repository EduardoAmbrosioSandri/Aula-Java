public class Moto extends Veiculo {


    private TipoPartida tipoPartida;

    public Moto(String marca, String modelo, Integer ano, TipoPartida tipoPartida) {
        super(marca, modelo, ano);
        this.tipoPartida = tipoPartida;
    }

    public void ligar() {
        if (tipoPartida.equals(TipoPartida.ELETRICA)) {
            System.out.println("Apertando o botão de partida");
        } else {
            System.out.println("apertando pedal");
        }
    }

}
