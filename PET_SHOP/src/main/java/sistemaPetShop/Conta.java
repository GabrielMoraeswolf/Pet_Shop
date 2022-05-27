package sistemaPetShop;

public class Conta {
    
    private String dataVencimento;
    private String dataPagamento;
    private String descricao;
    private double valor;

    public Conta(){
        this.valor = 0;
    }
    
    public Conta(String dataVencimento, String dataPagamento, String descricao, double valor){
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.descricao = descricao; 
        this.valor = valor;
    }
    public String  getVencimento() {
        return dataVencimento;
    }

    public String  getPagamento(){
        return dataPagamento;
    }

    public String getDescricacao() {
        return descricao;
    }

    public double getValor(){
        return valor;
    }

    public boolean setVencimento(String dataVencimento){
        this.dataVencimento = dataVencimento;
        return true;
    }

    public boolean setPagamento(String dataPagamento){
        this.dataPagamento = dataPagamento;
        return true;
    }

    public boolean setDescricao(String descricao){
        this.descricao = descricao;
        return true;
    }

    public boolean setValor(double valor){
        this.valor += valor;
        this.valor = (this.valor < 0 ? 0 : this.valor);
        return true;
    }

    public String toString() {
        return String.format("Data de pagamento: %s\nData de vencimento %s\nDescricao: %s\nValor: R$ %s\n",
        getPagamento(),getVencimento(),getDescricacao(),getValor() ); 
    }

}
