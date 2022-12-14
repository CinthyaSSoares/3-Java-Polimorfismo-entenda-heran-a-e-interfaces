
public class Gerente extends Funcionario implements Autenticar {//herdando a classe Funcionario e "assina" o contrato Autenticar
	
	//bonificação
	public double getBonificacao() {
		System.out.println("Bonificação do Gerente");
		return super.getSalario();
	}

	private AutenticacaoBase autentificador;
	
	public Gerente() {
		this.autentificador = new AutenticacaoBase();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentificador.autentica(senha);
	}
	
}
