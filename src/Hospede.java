
public class Hospede {

	private int codigo;
	private String nome, cpf, rg, telefone;
	
	public Hospede(int codigoIn, String nomeIn, String cpfIn, String rgIn, String telefoneIn) {
		
		codigo = codigoIn;
		nome = nomeIn;
		cpf = cpfIn;
		rg = rgIn;
		telefone = telefoneIn; 
		
	}
	
	public void Imprimir_hospede() {
		
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Telefone: " + telefone);
	}
}
