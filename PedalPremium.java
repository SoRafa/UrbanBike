package urbanbike;

public class PedalPremium extends ContaUrbanBike implements Imprimivel{
	private double limite;
	
	  public double getLimite(){
		 return this.limite;
	  	}
		   
	  public void setLimite(int limite){
		  this.limite = limite;
	  	}

	  public void mostraDados() {
			 System.out.println(""+getConta()); 
			 System.out.println(""+getSaldo()); 
	  	}

	@Override
	public double depositarCredito(double valor) {
		
		return 0;
	}

	@Override
	public double gastarCredito(double valor) {
		
		return 0;
	}
}
