
package banco;

import java.util.Scanner;

public class Conta {

    private int numero;
    private final Cliente objCliente = new Cliente(); // atributos ou variáveis de instância // criando objeto
    Cliente objCliente2;
    double saldo;
    private double limite;
    private double calculo;
    private static int totalDeContas;
    
    // CONSTRUTOR - deve ter o mesmo nome da classe
   Conta(){
       System.out.println("Construindo uma conta");
       Conta.totalDeContas = Conta.totalDeContas+1;
    
} 
    Conta(double saldo){
        this();
        this.saldo =  saldo;
    }
    Conta (int numero, double saldo){
        this(saldo); // invocando o construtor saldo
        this.numero = numero;
        
    }
     
    //-------------------------------------------------------
    public double getCalculo() {
        return calculo;
    }

    /**
     * @param calculo the calculo to set
     */
    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    /**
     * @return the totalDeContas
     */
    public static int getTotalDeContas() {
        return totalDeContas;
    }

    /**
     * @param aTotalDeContas the totalDeContas to set
     */
    public static void setTotalDeContas(int aTotalDeContas) {
        totalDeContas = aTotalDeContas;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the objCliente
     */
    public Cliente getObjCliente() {
        return objCliente;
    }

    /**
     * @return the objCliente2
     */
    public Cliente getObjCliente2() {
        return objCliente2;
    }

    /**
     * @param objCliente2 the objCliente2 to set
     */
    public void setObjCliente2(Cliente objCliente2) {
        this.objCliente2 = objCliente2;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
   
    public double getSaldo(){
        return this.saldo;
    }
    
    
    String getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // METODOS -------------------------------------------------------------------------------------------
    
    public void deposita(double saldo){ // método
        this.setSaldo(this.getSaldo() + saldo);
        System.out.println(getObjCliente().getNome()+"Depósito relaizado para:"+getObjCliente2().getNome());
        System.out.println("Deposito efetuado com sucesso!");
        //this.saldo +=saldo;
        
    } // fm deposita    
        
        public boolean saca(double saldo){
            if(this.getSaldo()>=saldo){
                this.setSaldo(this.getSaldo() - saldo);
                System.out.println("Saque realizado com sucesso!)");
                return true;
            } // fim if
            
            else 
                System.out.println("Saldo insuficiente");
                return false;
        }// fim saca
        
        public boolean transfere(Conta destino, double saldo){
            if (this.saca(saldo)== true){
                destino.deposita(saldo);
                System.out.println("Transferencia realizada com sucesso!");
                return true;
            } // fim if
            
            else {
                return false;
                       
        } // fim else
            
              
} // fim public 
//-------------------------------------------------------------------
public void atualiza(double taxa){
    
      this.saldo += this.saldo*taxa;

} // fim atualiza

//---------------------------------------------------------------------

 
 
}// fim conta

 




       


