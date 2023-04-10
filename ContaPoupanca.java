
package banco;

public class ContaPoupanca extends Conta{
    
    @Override // A conta poupança tem a taxa triplicada 
    public void atualiza(double taxa){
      
      deposita(getSaldo()*(taxa*3));

} // fim atualiza

    
}
