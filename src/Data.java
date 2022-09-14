
public class Data {

	private int dia;
	private String mes;
	private int ano;
	
	public Data(int diaIn, String mesIn, int anoIn){
		
		dia = diaIn; // this.dia = dia;
		ano = anoIn; // this.ano = ano;
		mes = mesIn; // this.mes = mes;
		
	}
	
	public void imprimir_data() {
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	}
	
}
