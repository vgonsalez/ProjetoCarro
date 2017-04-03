
public class Principal {

	public static void main(String[] args) {
		
		Carro meuFusquinha = new Carro("Fusca 67");
		meuFusquinha.setQuantidadePortas(0);
		meuFusquinha.setQuantidadeRodas(4);
		meuFusquinha.setCor("Vermelho");
		
		System.out.println(Carro.Dominio + " é do modelo " + meuFusquinha.getModelo());
		
		System.out.println("Carro é do modelo " + meuFusquinha.getModelo());
		System.out.println("Carro tem " + meuFusquinha.getQuantidadePortas() + " portas");
		System.out.println("Carro tem " + meuFusquinha.getQuantidadeRodas() + " rodas");
		System.out.println("Carro tem a cor " + meuFusquinha.getCor());

	}

}
