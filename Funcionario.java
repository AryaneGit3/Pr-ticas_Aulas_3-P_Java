package banco;

import java.util.Scanner;


public class Funcionario {

    private String nome;
    private String rg;
    private String departamento;
    private String admissao;
    private Double salario;
    private Boolean ativo = true;

    public void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        setNome(scanner.next());

        System.out.println("Informe o RG do funcionário: ");
        setRg(scanner.next());

        System.out.println("Informe o departamento do funcionário: ");
        setDepartamento( scanner.next());

        System.out.println("Informe a data de admissão do funcionário (formato dd/mm/yyyy): ");
        setAdmissao(scanner.next());

        System.out.println("Informe o salário do funcionário: ");
        setSalario(scanner.nextDouble());
        
    } // fim cadastro funcionario
    
    void mostra(){
        
        System.out.println(" *** DADOS DO FUNCIONARIO *** ");
        System.out.println("\n Nome do Funcionario:"+getNome());
        System.out.println("\n Documento RG do funcionario:"+getRg());
        System.out.println("\n Departamento de atuacao:"+getDepartamento());
        System.out.println("\n Data de admissao:"+getAdmissao());
        System.out.println("\n Salario:"+getSalario());
        
    } //  fim mostra
    
    void bonifica(double bonificacao, double salario){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser bonificado:");
        bonificacao = entrada.nextDouble();
        
        double soma = bonificacao + salario;
        System.out.println("O valor acrecido de bonicacao eh:"+soma);
    
    } // fim bonifica
    
     // CONSTRUTOR:
    
     public double getBonificacao(){
         return this.salario * 0.10;
 }
     
    //------------------------------------------------------------------------------------   
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    
    }
    public Double getSalario() {
        return salario;
    }

    private String getAtivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    

