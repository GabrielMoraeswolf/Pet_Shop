package sistemaPetShop;
import java.util.ArrayList;

public class Cliente {
    private String nome, cpf;
    private ArrayList<Relatorio> relatorios = new ArrayList<>();
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        return true;
    }

    public boolean setCPF(String cpf) {
        this.cpf = cpf;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public String toString() {
        return String.format("Nome: %s\nCPF: %s\n", getNome(), getCPF());
    }
}
