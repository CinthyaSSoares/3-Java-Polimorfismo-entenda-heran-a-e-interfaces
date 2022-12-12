
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Ana");
		g1.setCpf("0000000000");
		g1.setSalario(5000);
		g1.setSenha(1234);
		
		boolean autenticar = g1.autentica(1234);
		
		System.out.println(autenticar);
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.getBonificacao());
		
		
	}
}
