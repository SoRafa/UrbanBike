package urbanbike;

public class PedalPop extends ContaUrbanBike implements Imprimivel{
	private int taxaDeOperacao;
        
	  public int getTaxa(){
		 return this.taxaDeOperacao;
	  	}
		   
	  public void setTaxa(int Taxa){
		  this.taxaDeOperacao = Taxa;
	  	}
	  
        @Override
	  public void mostraDados() {
		 System.out.println("Número da conta: " + getConta()); 
		 System.out.println("Valor na carteira: " + getCarteira()); 
	  	}

	@Override
	public double depositarCredito(double saldo) {
        this.carteira += saldo;
        this.carteira -= taxaDeOperacao;
      	return this.carteira; 
	}

	@Override
	public double gastarCredito(double saldo) {
		if(this.carteira < saldo+taxaDeOperacao){
			System.out.println("saldo insuficiente, voce tem " + getCarteira() + " de credito");
			return 0;
			} else {
	        	this.carteira -= saldo;
	        	this.carteira -= taxaDeOperacao;
	        	return this.carteira;
			}
		}
	}