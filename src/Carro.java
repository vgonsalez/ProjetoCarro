public class Carro {
	
	public static final String DOMINIO = "Carro";
	
	private String modelo;
	private Integer quantidadePortas;
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
	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}
	/*
	  public Integer getQuantidadePortas() {
	  	if(quantidadePortas==null){
	  		return "";
	  	}else{
			return quantidadePortas.toString();
		}
	}
	 */
	public void setQuantidadePortas(int quantidadePortas) {
		if (quantidadePortas<1){
			System.out.println(Mensagens.MENSAGEM_ERRO_VALIDACAO_QUANTIDADE_PORTA);
		}
		else{
			this.quantidadePortas = quantidadePortas;
		}
		
	}
	public String getDominio() {
		return DOMINIO;
	}
	
}
