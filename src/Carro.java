public class Carro {
	
	public static final String Dominio = "Carro";

	private String modelo;
	private int quantidadePortas;
	private String cor;
	private int quantidadeRodas;

	public Carro(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}
	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		if (quantidadePortas<1){
			System.out.println("Erro - Não pode ser criado com menos de uma porta");
		}
		else{
			this.quantidadePortas = quantidadePortas;
		}
		
	}
	public String getDominio() {
		return Dominio;
	}
	
	
	
}
