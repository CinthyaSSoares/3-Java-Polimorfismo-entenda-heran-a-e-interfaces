
public abstract class Conta {
	
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
        
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("O toal de contas é " + Conta.total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Criando uma nova conta " + this.numero);
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if(this.saca(valor)) {
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
   }
       
    // Fazendo os Getters e Setters:
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	if(numero <= 0) {
    		System.out.println("Não é permitido valor 0 ou menor");
    		return;
    	}
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(agencia <= 0) {
    		System.out.println("Não é permitido valor 0 ou menor");
    		return;
    	}
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return titular;
	}
    
    public static int getTotal() {
    	return Conta.total;    	
    }
}