package urbanbike;

import java.util.ArrayList;

public class Relatorio {
	public void gerarRelatorio(ArrayList<ContaUrbanBike> listaPedais) {
    	int i = 0;
    	while  (i < listaPedais.size() ) {
            System.out.println("\n====================");
            System.out.println("Conta: " + listaPedais);
            System.out.println("Código: " + listaPedais.get(i).getConta());
            System.out.println("Saldo: " + listaPedais.get(i).getCarteira());
            System.out.println("====================");
			i++;
        }
        if(i == 0) {
        	System.out.println("Lista vazia!");
        }  
	}
}
