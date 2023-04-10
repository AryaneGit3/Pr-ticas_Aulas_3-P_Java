
package banco;

/**
 *
 * @author aryan
 */
public class AtualizadorDeContas {

  private double saldoTotal = 0;
  private double selic;
  
  //CONSTRUTOR SELIC:
  
  public AtualizadorDeContas (double selic){
      this.selic = selic;
      
  } // fim const
  
  //---------------------------------------------------------
   
    public double getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return the selic
     */
    public double getSelic() {
        return selic;
    }

    /**
     * @param selic the selic to set
     */
    public void setSelic(double selic) {
        this.selic = selic;
    }
    //-------------------------------------------------------
    // MÉTODOS: 
    
    public void roda(Conta c){
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo novo: "+c.getSaldo());
        this.saldoTotal += c.getSaldo();
        
    }
  
    
    
   
}


