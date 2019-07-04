package urbanbike;

public class PedalPop extends ContaUrbanBike implements Imprimivel{
	private double taxaDeOperacao;
        
	public double getTaxa(){
		return this.taxaDeOperacao;
	}
		   
	public void setTaxa(int Taxa){
		this.taxaDeOperacao = Taxa;
	}
	  
    @Override
	public void mostraDados() {
    	System.out.println("         ========================================");
		System.out.println("		  Número da conta: " + getConta()); 
		System.out.println("		  Valor na carteira: " + getCarteira()); 
		System.out.println("		  Tipo de conta: " + getTipoDeConta()); 
	    System.out.println("          ========================================");
    }

    @Override
    public double depositarCredito(double saldo) {
    	taxaDeOperacao = (saldo * 0.05);
    	this.carteira += saldo;
        this.carteira -= taxaDeOperacao;
      	return this.carteira; 
	}

	@Override
	public double gastarCredito(double km) { // 1 kilometro = R$0.50 centavos
		km = (km * 0.5);
    	taxaDeOperacao = (km * 0.10);
		if(this.carteira < km + taxaDeOperacao){
			System.out.println("saldo insuficiente, voce tem " + getCarteira() + " de crédito");
			return 0;
			} else {
	        	this.carteira -= km;
	        	this.carteira -= taxaDeOperacao;
	        	return this.carteira;
			}
		}
	}