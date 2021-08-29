package state;

public class Sediento implements Estado {
	private Tamagotchi tamagotchi;
	public Sediento(Tamagotchi tama) {
		this.tamagotchi = tama;
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		this.tamagotchi.setEstado(new Feliz(this.tamagotchi));

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
