package urbanbike;

public abstract class ContaUrbanBike {
	private int numConta;
	protected double carteira;
	protected String tipoDeConta;
  	public abstract double depositarCredito(double saldo);
  	public abstract double gastarCredito(double saldo);
  
	public int getConta(){
		return this.numConta;
	}
		   
	public void setConta(int num){
		this.numConta = num;
	}
	  
	public double getCarteira(){
		return this.carteira;
	}
			
	public void setCarteira(double carteira){
		this.carteira = carteira;
	}
	  
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	  
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
}
