package praticaANP;

public class Papagaio extends Ave {

	private String vocabulario;

	public String getVocabulario() {
		return vocabulario;
	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}

	public void falar() {
		System.out.println("Olá, Olá!");
	}
}