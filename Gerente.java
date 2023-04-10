/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author aryan
 */
public class Gerente extends Funcionario {  
   
// extends indica que é uma subclasse da superclasse Funcionario
    
    private int senha;  // atributos exclusivos da classe gerente
    private int numeroDeFuncionariosGerenciados;
    
    
    // ENCAPSULAMENTO: 
    
    public int getSenha() {
        return senha;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

 
    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
   
    //----------------------------------------------------------------------------------
    // métodos locais da classe:
    
    public boolean autentica(int senha){
        if(this.getSenha() == senha){
            System.out.println("Acesso permitido");
            return true;
        }    
            else {  
                System.out.println("Acesso Negado!");
                return false;
        }
    }
    
    //-----------------------------------------------------------------------------------
    
    @Override // Overide Indica que o método foi reescrito conforme demanda da classe
    
    public double getBonificacao(){
         return this.getSalario() * 0.15;
 }
   //------------------------------------------------------------------------------------
   // Indica que o método foi reescrito conforme demanda da classe
    
    public double getBonificacao2(){
         return super.getBonificacao() + 1000; // super puxa o metodo ja feito
         
 }
}
