
public class Cliente implements Autenticar {
	
	private AutenticacaoBase base;
	
	public Cliente() {
		this.base = new AutenticacaoBase();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.base.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.base.autentica(senha);
	}
}