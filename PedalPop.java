package urbanbike;

public class PedalPop extends ContaUrbanBike implements Imprimivel{
	private int taxaDeOperação;
	
	  public int getTaxa(){
		 return this.taxaDeOperação;
	  	}
		   
	  public void setTaxa(int Taxa){
		  this.taxaDeOperação = Taxa;
	  	}
	  
	  public void mostraDados() {
		 System.out.println(""+getConta()); 
		 System.out.println(""+getSaldo()); 
		 System.out.println(""+getTaxa());
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
