package RoboCanino;


public class ComportamentoAgressivo implements Comportamento{
	
	public void  latir()
	{
		System.out.println("Latindo agressivamente.");
	}
	
	public void morder(){
		System.out.println("Mordendo agressivamente.");
	}
	
	public void moverCauda() {
		System.out.println("Levantar cauda para ameaçar");
	}
}
