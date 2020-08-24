package revisaoLinguagensMoveis;

public class Animal {
	
	String name;
	String raca;
	
	public Animal() {
	}
	
	public Animal(String nome, String raca) {
		this.name = nome;
		this.raca = raca;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	//faz o animal caminhar
	public String caminha() {
		return "a caminhar..";
	}
	
	//Metodo toString para conseguimos printar no main.
	@Override
	public String toString() {
		return "Animal [nome=" + name + ", raca=" + raca + "]";
	}


}
