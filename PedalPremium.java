package urbanbike;

public class PedalPremium extends ContaUrbanBike implements Imprimivel{
	private double limite = -100;
	
	public double getLimite(){
		return this.limite;
	  	}
		   
	public void setLimite(int limite){
		this.limite = limite;
	  	}
        @Override
	public void mostraDados() {
		System.out.println("Número da conta: " +getConta()); 
		System.out.println("Valor na carteira: " +getCarteira()); 
	}

	@Override
	public double depositarCredito(double saldo) {
            this.carteira += saldo;
            return this.carteira; 
	}

	@Override
	public double gastarCredito(double saldo) {
		if(this.carteira <= limite){
			System.out.println("saldo insuficiente, voce tem " + this.carteira + " de credito");
	        return 0;
	      }else{
	      	this.carteira -= saldo;
	        return this.carteira;
	      }
	}
}
