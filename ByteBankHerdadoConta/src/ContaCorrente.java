
public class ContaCorrente extends Conta implements Tributavel {

		//Pegando contrutor da classe mãe
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override  //Sinalizando a regra de sobrescrita
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2; //Sacando mais a taxa
		return super.saca(valorASacar);
	}

	@Override //Tributavel
	public double getValorImporto() {
		return super.saldo * 0.01;
	}
	
}
