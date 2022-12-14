
// Autenticar é um "contrato"
	//Quem "assina" esse contrato precisa implementar
		//Implementar setSenha e autentica
public abstract interface Autenticar {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
