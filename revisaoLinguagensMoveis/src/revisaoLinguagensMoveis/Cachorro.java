package revisaoLinguagensMoveis;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	
	public Cachorro() {
	}

	//faz o cachorro latir
	public String late() {
		return "au_au_auuuuuu";
	}

}
