package praticaANP;

public class MainAnimal {

	public static void main(String[] args) {

		System.out.println("Bem Te Vi");
		BemTeVi bemTeVi = new BemTeVi();
		bemTeVi.setClasse("Aves");
		bemTeVi.setNome("Pituã");
		bemTeVi.imprime();
		bemTeVi.voar(1);
		bemTeVi.falar();
		System.out.println();

		System.out.println("Cachorro");
		Cachorro cachorro = new Cachorro();
		cachorro.setClasse("Mamíferos");
		cachorro.setNome("Mel");
		cachorro.setTipoLatido(false);
		cachorro.setVelocidade(30);
		cachorro.imprime();
		cachorro.falar();
		cachorro.correr();
		cachorro.setLateAlto();
		cachorro.setLateBaixo();
		System.out.println();

		System.out.println("Papagaio");
		Papagaio papagaio = new Papagaio();
		papagaio.setClasse("Aves");
		papagaio.setNome("Loro");
		papagaio.imprime();
		papagaio.voar(1);
		papagaio.falar();
		System.out.println();

		System.out.println("Vaca");
		Vaca vaca = new Vaca();
		vaca.setClasse("Mamíferos");
		vaca.setNome("Mimoza");
		vaca.setPermiteOrdenha(true);
		vaca.setVelocidade(25);
		vaca.imprime();
		vaca.falar();
		vaca.correr();
		vaca.isPermiteOrdenha();
		System.out.println();
		
		//Testando a função falar da classe 'Animal'
		Animal animal = new Animal();
		animal.falar();
	}

}