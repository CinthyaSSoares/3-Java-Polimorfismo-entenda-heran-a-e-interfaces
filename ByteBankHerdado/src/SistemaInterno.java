
public class SistemaInterno {
	
	private int senha;
	
	public void autentica(Autenticar fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Entrada autorizada com sucesso.");
		} else {
			System.out.println("Entrada não autorizada.");
		}
	}
}
