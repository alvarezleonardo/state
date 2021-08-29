package state;

public class Hambriento implements Estado {
	private Tamagotchi tamagotchi;
	public Hambriento(Tamagotchi tama) {
		this.tamagotchi = tama;
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		this.tamagotchi.setEstado(new Feliz(tamagotchi));
	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		
	}

}
