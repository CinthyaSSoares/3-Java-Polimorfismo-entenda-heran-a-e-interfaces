
public class TesteReferencia {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();		
		g1.setNome("Aninha");
		g1.setSalario(5000);
				
		EditorVideo ev = new EditorVideo();
		ev.setNome("Andrea");
		ev.setSalario(2500);
		
		Designer d = new Designer();
		d.setNome("Luci");
		d.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(g1.getNome() + " recebe a bonificação de: R$" + controle.getSoma());
		
		System.out.println(ev.getNome() + " recebe a bonificação de: R$" + controle.getSoma());
		
		System.out.println(d.getNome() + " recebe a bonificação de: R$" + controle.getSoma());
		
	}
}
