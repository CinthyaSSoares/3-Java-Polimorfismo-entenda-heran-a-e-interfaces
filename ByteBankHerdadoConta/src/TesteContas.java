
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(333,444);
		cp.deposita(200);
		
		cc.transfere(20, cp);
		
		System.out.println("Saldo da conta corrente: R$" + cc.getSaldo());
		System.out.println("Saldo da conta poupança: R$" + cp.getSaldo());
	}
}
