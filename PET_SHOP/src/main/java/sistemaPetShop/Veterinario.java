package sistemaPetShop;

public class Veterinario extends Funcionario{
   public Veterinario(String login, String senha, String nome, double salario){
        super(login, senha, nome, salario);
    } 

    public String toString() {
        return String.format("Nome: %s\nLogin: %s\nSenha: %s\nSalario: %s\n",
         getNome(),getLogin(),getSenha(),getSalario()); 
    }
} 
