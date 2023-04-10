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
public class TesteFuncionario1
{
    public static void main(String[] args) {
       
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.cadastrarFuncionario();
        System.out.println("Funcionario cadastrado com sucesso!");
        
       funcionario1.mostra();
        System.out.println("Dados Exibidos com sucesso!");
        
       funcionario1.bonifica(50, 100);
        System.out.println("Bonificacao feita com sucesso!");
    }
    
}
