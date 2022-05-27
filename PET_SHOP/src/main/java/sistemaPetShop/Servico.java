package sistemaPetShop;

public class Servico extends Data {
    
    private Cliente cliente;
    private String tipo;
    private double preco;
    
    public Servico(int hora, int dia, int mes, String tipo, double preco, Cliente cliente) {
        super(hora, dia, mes); 
        this.tipo = tipo;
        this.preco = preco;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public boolean servico (Cliente cliente) {
        this.cliente = cliente;
        return true;
    }

    public String toString() {
        return String.format("Tipo: %s\nPreco: %s\nCliente:%s\nData : %s"+"/"+"%s\nHorario : %s:00 h\n",
         tipo,preco,cliente,dia,mes,hora); 
    }
}
