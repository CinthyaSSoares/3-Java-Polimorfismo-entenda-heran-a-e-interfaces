
public class Administrador extends Funcionario implements Autenticar {
	
	@Override
	public double getBonificacao() {
		return 150;
	}	
	
	private AutenticacaoBase autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoBase();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
