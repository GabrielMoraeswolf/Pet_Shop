package sistemaPetShop;

public class Vendedor extends Funcionario {
    public Vendedor(String login, String senha, String nome, double salario) {
        super(login, senha, nome, salario);
    }
    
    public void venderProduto(Loja loja, String animal, String tipo, int qtd, double preco){
        Produto p = loja.getProduto(tipo, animal);
            // pegar a quantidade
            
        p.setQuantidade(-qtd);
        loja.setControle("Vendido  " + String.valueOf(qtd)+ " " + tipo + " de " + animal + ". Total :" + Double.toString(qtd * p.getPreco()) + " reais\n");
        
    }
    
    public void cadastraCliente(Loja loja, String nome, String cpf){
        Cliente cliente = new Cliente(nome, cpf);
        loja.setCliente(cliente);
    }
    
    public void venderServico(Loja loja, int hora, int dia, int mes, double preco, String nome, String cpf , String tipo){
        Cliente cliente = loja.getCliente(nome, cpf);

        if (tipo.equals("Veterinario")) { // se for consulta ao veterinario
            Servico s = new Servico(hora, dia, mes, tipo, preco, cliente);
            loja.setCalendario(s);
            loja.setControle("Consulta ao veterinario " + Integer.toString(dia) + "-" + Integer.toString(mes) + " R$" + Double.toString(preco) + "\n");
        }
        else {
            Servico s = new Servico(hora, dia, mes, tipo, preco, cliente);
            loja.setCalendario(s);
            loja.setControle("Banho/Tosa " + Integer.toString(dia) + "-" + Integer.toString(mes) + " R$" + Double.toString(preco) + "\n");
        }
    }

    public String toString(Vendedor v) {
        return String.format("Nome: %s\nLogin: %s\nSenha: %s\nSalario: %s\n",
        v.getNome(), v.getLogin(), v.getSenha(), v.getSalario());
    }
}
