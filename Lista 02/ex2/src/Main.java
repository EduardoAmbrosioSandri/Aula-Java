public class Main {
    public static void main(String[] args) {
    Celular meuCelular = new Celular("Iphone", "15 Pro Max", 90);

    System.out.println("Marca: " + meuCelular.getMarca());
    System.out.println("Modelo: " + meuCelular.getModelo());
    System.out.println("Capacidade da Bateria: " + meuCelular.getCapacidadeBateria());

    meuCelular.ligar();
    meuCelular.desligar();
    }
}