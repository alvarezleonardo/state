package state;

public class Inicial {

	public static void main(String[] args) {
		Tamagotchi tama = new Tamagotchi();
		tama.setEstado(new Feliz(tama));

	}

}
