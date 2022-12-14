
public abstract class Funcionario {//Não pode instanciar "criar" funcionario pois é abstrata
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	//bonificação com método abstrato "sem corpo"
	public abstract double getBonificacao();
	
	//Gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
