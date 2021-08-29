package state;

public class Feliz implements Estado {
	private Tamagotchi tamagotchi;
	public Feliz(Tamagotchi tama) {
		this.tamagotchi = tama;
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		System.out.println("Beep");
		System.out.println("Beep");
		System.out.println("Beep");
		System.out.println("Beep");
		System.out.println("Beep");
			
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		
	}

}
