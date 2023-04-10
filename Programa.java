/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author tulio
 */

public class Programa {
    public static boolean main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new Conta();
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entrada.nextDouble());
        
        System.out.println("Digite um valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())== true){
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insufiente para realizar saque!");
            return false;
        }
      
        System.out.println("Saldo minha conta: "+minhaConta.getsaldo());
        Conta outraConta = new Conta();
        System.out.println(minhaConta);
        System.out.println(outraConta);
        return false;
        
       
    
    
}
    
}
