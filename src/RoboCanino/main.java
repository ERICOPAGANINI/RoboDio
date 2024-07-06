package RoboCanino;

public class main {
	
	public static void main (String[] args){
	RoboCanino pituca = new RoboCanino();
	
	Comportamento agressivo = new ComportamentoAgressivo();
	Comportamento docil = new ComportamentoDocil();
	
	pituca.setComportamento(agressivo);
	pituca.latir();
	pituca.moverCauda();
	pituca.setComportamento(docil);
	pituca.latir();
	pituca.moverCauda();
	pituca.morder();
	
	}

}
