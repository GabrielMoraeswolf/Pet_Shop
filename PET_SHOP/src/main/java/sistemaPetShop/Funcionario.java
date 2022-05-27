package sistemaPetShop;

public class Funcionario{
    
    private String login;
    private String senha;
    private String nome;
    private double salario;
    
    public Funcionario(String login,String senha, String nome, double salario) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome()  {
        return nome;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        return true;
    }

    public String getSenha()  {
        return senha;
    }

    public boolean setSenha(String senha) {
        this.senha = senha;
        return true;
    }

    public String getLogin() {
        return login;
    }

    public boolean setLogin(String login) {
        this.login = login;
        return true;
    }

    public double getSalario(){
        return salario;
    }
    public boolean  setSalario(double salario){
        this.salario = salario;
        return true;
    }
    public String toString() {
        return String.format("Nome: %s\nLogin: %s\nSenha: %s\nSalario: %s\n",nome,login,senha,salario ); 
    }
}
