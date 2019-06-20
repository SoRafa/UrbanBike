package urbanbike;

public abstract class ContaUrbanBike {
	private int numConta;
	private double carteira;
  	public abstract double depositarCredito(double valor);
  	public abstract double gastarCredito(double valor);
  
	  public int getConta(){
		 return this.numConta;
	  	}
		   
	  public void setConta(int num){
		  this.numConta = num;
	  	}
	  
	  public double getSaldo(){
		  return this.carteira;
	  	}
			
	  public void setSaldo(int saldo){
		  this.carteira = saldo;
	  	}
	}
