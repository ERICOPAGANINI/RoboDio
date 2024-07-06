package RoboCanino;

public class RoboCanino {

	private Comportamento comportamentoStrategy;
	
	public void setComportamento (Comportamento comportamentoStrategy) {
	this.comportamentoStrategy = comportamentoStrategy;
	}
	
	public void morder() {
		comportamentoStrategy.morder();
	}
	
	public void moverCauda() {
		comportamentoStrategy.moverCauda();
	}
	
	
	public void latir() {
		comportamentoStrategy.latir();
	}
	
	
}
