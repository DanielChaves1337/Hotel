
public class main {

	public static void main(String[] args) {
		
		Data DE1 = new Data(13, "Set", 2022);
		Data DS1 = new Data(14,"Set", 2022);
		Hospede H1 = new Hospede(123, "Daniel", "123.123.123-45", "78.789.789-00", "(77)98899-0011");
		
		Hospedagem Hos1 = new Hospedagem(123, DE1, DS1, H1, 01);
		
		Hos1.relatorio();
	}
}
