package sistemaPetShop;

public class Produto {
    private String animal, tipo;
    private double preco;
    private int quantidade;

    public Produto(String animal, String tipo, double preco, int quant) {
        this.animal = animal;
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quant;
    }

    public String getAnimal() {
        return animal;
    }

    public boolean setAnimal(String animal) {
        this.animal = animal;
        return true;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        this.tipo = tipo;
        return true;   
    }

    public double getPreco() {
        return preco;
    }

    public boolean setPreco(double preco) {
        this.preco = preco;    
        return true;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean setQuantidade(int quantidade) {
        this.quantidade += quantidade;
        return true;
    }
}
