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
public class TesteGerente {
    
    public static void main(String[] args) {

    /*Gerente gerente1 = new Gerente();
    
    
    gerente1.setNome("José Aguiar");
    gerente1.setRg("MG 22.455.888-89");
    gerente1.setDepartamento("Analista de Dados");
    gerente1.setAdmissao("12/02/2019");
    gerente1.setSalario(5000.00);
    gerente1.setSenha(5600); // Eu defino essa senha - sistema
    gerente1.autentica(4500);
    gerente1.mostra();*/
    
    Gerente gerente2 = new Gerente();
    gerente2.setSalario(5000.00);
    System.out.println("Salario sem bonificacao:"+gerente2.getSalario());
    System.out.println("Bonificacao Gerente 2:"+gerente2.getBonificacao());
    System.out.println("Valor da bonificacao com adicao de mil reais:"+gerente2.getBonificacao2());
    
   
       
    
    
    }
}
