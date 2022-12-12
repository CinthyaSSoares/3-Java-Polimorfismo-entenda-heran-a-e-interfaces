
public class Gerente extends Funcionario {//herdando da classe Funcionario
	
	private int senha = 0;
		
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	//bonificação
	public double getBonificacao() {
		System.out.println("Bonificação do Gerente");
		return super.getSalario();
	}
	
}
