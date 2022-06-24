package locadora.model;

public class Carro implements Comparable{

    private String marca, modelo, cor, placa;
    private double valor;

    public Carro(String marca, String modelo, String cor, String placa, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Object o) {
        Carro car = (Carro) o;
        if (this.valor == car.getValor()){
            return 0;
        } else if (this.valor < car.getValor()) {
            return -1;
        }else
            return 1;
    }

    @Override
    public String toString() {
        return "Carro { " +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", valor=" + valor +
                " }";
    }
}
