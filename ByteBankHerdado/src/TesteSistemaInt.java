
public class TesteSistemaInt {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(1111);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(3333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
