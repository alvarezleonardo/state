package state;

public class Tamagotchi {
	private Estado estado;

	
	public void tomar(){
		this.estado.tomar();
		
	}

	public void comer(){
		this.estado.comer();
		
	}

	public void mimar(){
		this.estado.mimar();
		
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	

}
