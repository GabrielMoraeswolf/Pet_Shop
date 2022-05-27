package sistemaPetShop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;


public class Loja {
    private Servico calendario[][][][] = new Servico[8][30][12][2];
    private Conta conta;
    private ArrayList<Produto> estoque = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<String> controle_vendas = new ArrayList<>();

    public Loja(Conta conta) {
        // construir calendario
        this.conta = conta;
        Administrador adm = new Administrador("admin", "admin", "*", 5000);
        funcionarios.add(adm);
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 30; j++)
                for (int k = 0; k < 12; k++)
                    for (int l = 0; l < 2; l++)
                        calendario[i][j][k][l] = null;
    }
    
    public Conta getConta() {
        return conta;
    }

    public Produto getProduto(String tipo, String animal) {
        for (Produto p: estoque) {
            if (p.getTipo().equals(tipo) && p.getAnimal().equals(animal)) {
                return p;
            }
        }
        return null;
    }

    public Cliente getCliente(String nome, String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) && cliente.getCPF().equals(cpf))
                return cliente;
        }
        Cliente c = new Cliente(nome, cpf);
        clientes.add(c);
        return c;
    }
    
    public Funcionario getFuncionario(String login, String senha) {
        for (Funcionario x: this.funcionarios) {
            if (x.getLogin().equals(login) && x.getSenha().equals(senha))
                return x;
        }
        return null;
    }
    
    public ArrayList getEstoque(){
        return this.estoque;
    }
    
    public String converteMes(int n) {
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
                        "Junho", "Julho", "Agosto", "Setembro", "Outubro", 
                        "Novembro", "Dezembro"};
        return mes[n - 1];
    }
    
    public boolean setProduto(Produto produto){
        estoque.add(produto);
        return true;
    }

    public boolean setConta(Conta conta) {
        this.conta = conta;
        return true;
    }

    public boolean setCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    public boolean setFuncionario(Funcionario func) {
        funcionarios.add(func);
        return true;
    }

    public boolean setCalendario(Servico servico) {
        int hora = servico.getHora();
        int dia = servico.getDia();
        int mes = servico.getMes();
        int tipo ;// consulta - 1, banho/tosa - 0
        if(servico.getTipo().equals("Veterinario")){
            tipo = 0;
        }else{
            tipo = 1;
        }
        calendario[hora - 8][dia - 1][mes - 1][tipo] = servico;
        return true;
    }

    public void setControle(String venda) {
        this.controle_vendas.add(venda);
    }
    
    public String[][] getControle(){
        String controle[][] = new String[this.controle_vendas.size()][1];
        int i = 0;
        for(String s : this.controle_vendas){
            controle[i][0] = s;
            i++;
        }
        return controle;
    }
    
    public String[][] getDadosProdutos(){
        String dados[][] = new String [this.estoque.size()][4];
        int i = 0;
        for(Produto p : this.estoque){
            if(p.getQuantidade() > 0){
                dados[i][0] = p.getAnimal();
                dados[i][1] = p.getTipo();
                dados[i][2] = String.valueOf(p.getPreco());
                dados[i][3] = String.valueOf(p.getQuantidade());
                i++;
            }
        }
        String dados1[][] = new String[i][4];
        for(int j = 0; j < i; j++){
            for(int k = 0; k < 4; k++){
                dados1[j][k] = dados[j][k];
                dados1[j][k] = dados[j][k];
                dados1[j][k] = dados[j][k];
                dados1[j][k] = dados[j][k];
            }
        }
        
        return dados1;
    }
    // public void mostraCalendario

    public String[][] getVetorClientes(){
        String clientesR [][] = new String[this.clientes.size()][2];
        int i = 0;
        for(Cliente c : this.clientes){
            clientesR[i][0] = c.getNome();
            clientesR[i][1] = c.getCPF();
            i++;
        }
        return clientesR;
    }
    
    public String[][] getVetorFuncionario(){
        String funcionarios1[][] = new String[this.funcionarios.size()][5];
        int i = 0;


        for(Funcionario c : this.funcionarios){
            funcionarios1[i][0] = c.getNome();
            funcionarios1[i][1] = c.getClass().getName().split("p.")[1];
            funcionarios1[i][2] = c.getLogin();
            funcionarios1[i][3] = c.getSenha();
            funcionarios1[i][4] = String.valueOf(c.getSalario());
            i++;
        }
        return funcionarios1;
    }
            
    public Servico proxServico() {
        GregorianCalendar calendar = new GregorianCalendar();
        int dia = calendar.get(GregorianCalendar.DAY_OF_MONTH) - 1;
        int mes = calendar.get(GregorianCalendar.MONTH) ;
        for(int i = 0; i < 8; i++){
            if(this.calendario[i][dia][mes][0] != null){
                Servico aux;
                aux = calendario[i][dia][mes][0];
                calendario[i][dia][mes][0] = null;
                return aux;
            }
        }
        return null;
    }
    
    public String[][] getCalendario(int mes){
        String calen[][] = new String [8][30];
        mes--;
        String aux = "";
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 30; j++){
                if(this.calendario[i][j][mes][0] == null){
                    aux = "  -  /";
                }else{
                    aux = "  *  /";
                }
                if(this.calendario[i][j][mes][1] == null){
                    aux += "  -  ";
                }else{
                    aux += "  *  ";
                }
                calen[i][j] = aux;
                }
        return calen;             
    }
    public boolean verifica_login(String login) {
        for (Funcionario f : funcionarios) {
            if (f.getLogin().equals(login) == true)
                return false;
        }
    return true;
    }
    
    public String[] getAnimais() {
        int pos = 0;
        String aux[] = new String[estoque.size()];
        for (Produto p : estoque) {
            String animal = p.getAnimal();
            boolean ok = true;
            for (int j = 0; j < pos; j++) {
                if (animal.equals(aux[j])) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                aux[pos++] = animal;
            }
        }
        String animais[] = new String[pos];
        for (int i = 0; i < pos; i++) {
            animais[i] = aux[i];
        }
        return animais;
    }
    
    public String[] getProdutosDisp(String animal) {
        int pos = 0;
        String aux[] = new String[estoque.size()];
        for (Produto p : estoque) {
            if (p.getAnimal().equals(animal)) {
                aux[pos++] = p.getTipo();
            }
        }
        String prod[] = new String[pos];
        for (int i = 0; i < pos; i++) {
            prod[i] = aux[i];
        }
        return prod;
    }
}
