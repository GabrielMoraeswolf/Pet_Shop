package sistemaPetShop;
import java.util.ArrayList;

public class Administrador extends Vendedor {
    
    public Administrador(String login, String senha, String nome, double salario) {
        super(login, senha, nome, salario);
    }

    public void cadastraFuncionario (Loja loja, String nome, String cargo, String login, String senha, double salario) {
        if (cargo.equals("Vendedor")) {
            Vendedor vend = new Vendedor(login, senha, nome, salario);
            loja.setFuncionario(vend);
        }
        else if (cargo.equals("Veterinario")) {
            Veterinario vet = new Veterinario(login, senha, nome, salario);
            loja.setFuncionario(vet);
        } 
    }

    public void pagarConta(Loja loja){
        //cout << *(loja->conta);
        loja.getConta().setValor(-(loja.getConta().getValor()));
    }

    public void comprarProdutos(Loja loja, String animal, String tipo, double preco, int qtd){
        
        loja.setControle("Comprado  " + Integer.toString(qtd) + " " + tipo + " de " + animal +"\n");
        boolean ok = false;
        ArrayList<Produto> estoque = loja.getEstoque();
        for (Produto p: estoque ) {
            if (p.getAnimal().equals(animal) && p.getTipo().equals(tipo)) {
                p.setQuantidade(qtd);
                ok = true;
            }
        }
        if (!ok) {
            // cria um novo Produto
            Produto p = new Produto(animal, tipo, preco, qtd);
            loja.setProduto(p);
        }
        loja.getConta().setValor(preco * qtd);
    }

   
}
