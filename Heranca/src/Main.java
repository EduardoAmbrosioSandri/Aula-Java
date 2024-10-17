public class Main {
    public static void main(String[] args) {
        Moto start = new Moto("honda", "start", 2010, TipoPartida.ELETRICA);
        start.acelerar();
        start.frear();
        start.empinar();

        Caminhao scania = new Caminhao("scania", "1113", 2005);
        scania.acelerar();
        scania.frear();

        Carro saveiro = new Carro("Volkswagen", "saveiroG3", 2002);
        saveiro.acelerar();
        saveiro.frear();
    }

}