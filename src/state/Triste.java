package state;

public class Triste implements Estado {

	private Tamagotchi tamagotchi;
	public Triste(Tamagotchi tama) {
		this.tamagotchi = tama;
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		System.out.println("Beep");
		System.out.println("Beep");
		System.out.println("Beep");

		System.out.println("Se tildo");
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Beep");
		System.out.println("Beep");
		System.out.println("Vomitando");
	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		this.tamagotchi.setEstado(new Feliz(this.tamagotchi));
		
	}

}
