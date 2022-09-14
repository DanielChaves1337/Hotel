
public class Hospedagem {
	
	private int codigo;
	private Data dataEntrada;
	private Data dataSaida;
	private Hospede Hospede;
	private int aposento;
	
	public Hospedagem(int codigo, Data dataEntrada, Data dataSaida, Hospede Hospede, int aposento){
		
		this.codigo = codigo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.Hospede = Hospede;
		this.aposento = aposento;
	}
	
	public void relatorio() {
		  System.out.println("C�digo: " + codigo);
		  System.out.print("Data de entrada: ");
		  dataEntrada.imprimir_data();
		  System.out.print("Data de Sa�da: ");
		  dataSaida.imprimir_data();
		  System.out.println("H�spede: ");
		  Hospede.Imprimir_hospede();
		  System.out.println("Aposento: " + aposento);
		  
	}
	
}
