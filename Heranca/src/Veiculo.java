public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, Integer ano) {
    }

    public void acelerar(){
        System.out.println("vrumm");
    }
    public void frear(){
        System.out.println("iiiiigggg");
    }
    public void empinar(){
        System.out.println("empinando");
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
