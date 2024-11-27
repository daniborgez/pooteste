
package aula05;

public class Banco {
    public Integer numConta;
    protected String tipo; 
    private String dono; 
    private float saldo; 
    private boolean status; 
    
    public void Banco(){
        saldo = 0; 
        status = false; 
        
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo){
         this.status = true; 
         this.tipo = tipo;
         System.out.println("SEJA VEM VINDA, SUA CONTA DO TIPO  {" + this.tipo + "}  FOI CRIADA COM SUCESSO!");
         
    }
    
    public void fecharConta(){
       if(this.saldo == 0){
           this.status = false; 
           
       }else{
           System.out.println("ERRO!, É NECESSARIO NÃO TER SALDO NENHUM NA CONTA, SEJA POSITIVO OU NEGATIVO ");
       } 
    }
    
    public void depoistar(float valor){
        if(this.status = true){
            this.saldo = this.saldo +valor;
            System.out.println("DEPOSITE FEITO COM SUCESSO! SALDO ATUAL É:  " + this.saldo );
        }else{
            System.out.println("ERRO!NECESSARIO TER UMA CONTA ABERTA");
        }
    }
    
    public void sacar(float valor){
        if(this.status = true ){ //&& this.saldo => valor
            this.saldo = this.saldo - valor;
            System.out.println("Saque no valor de : " + valor + "feito com sucesso, saldo atual: " + this.saldo + " :) ");
        }else{
            System.out.println("ERRO!NECESSARIO TER UMA CONTA ABERTA OU SALDO ");
        }
    }
    
    public void pagarMensal(){
       if(this.tipo.equalsIgnoreCase("CC")&& this.saldo >= 12.00){
           this.saldo = this.saldo - 12;
           System.out.println("FEITO O PAGAMENTO, SALDO ATUAL É: "+ this.saldo);
       }else if(this.tipo.equalsIgnoreCase("CP")&& this.saldo >= 20.00){
           this.saldo = this.saldo - 20;
           System.out.println("FEITO O PAGAMENTO, SALDO ATUAL É: "+ this.saldo);    
       }else{
           System.out.println("SALDO INSUFICIENTE.");
       }   
    }
}
