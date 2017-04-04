
public class Principal {

	public static void main(String[] args) {
		
		Carro meuFusquinha = new Carro("Fusca 67");
		meuFusquinha.setQuantidadePortas(0);
		meuFusquinha.setQuantidadeRodas(4);
		meuFusquinha.setCor("Vermelho");
		
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_MODELO + meuFusquinha.getModelo());
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_QUANTIDADE_PORTAS + meuFusquinha.getQuantidadePortas());
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_QUANTIDADE_RODAS + meuFusquinha.getQuantidadeRodas());
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_COR + meuFusquinha.getCor());

	}

}
