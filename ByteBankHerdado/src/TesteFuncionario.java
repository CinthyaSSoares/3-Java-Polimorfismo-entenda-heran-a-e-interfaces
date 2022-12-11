
public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario cinthya = new Funcionario();
		
		cinthya.setNome("Cinthya Soares");
		cinthya.setCpf("4922222299-9");
		cinthya.setSalario(1200);
		
		System.out.println("Nome do funcionário(a): " + cinthya.getNome());
		System.out.println("CPF: " + cinthya.getCpf() + ", salário: " + cinthya.getSalario());
		
		
		
	}
}
