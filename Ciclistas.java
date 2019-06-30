package urbanbike;
import java.util.Scanner;
import java.util.ArrayList;

public class Ciclistas extends Relatorio implements Imprimivel{
    ArrayList<ContaUrbanBike> listaPedais = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Scanner scanMenu = new Scanner(System.in);
    int numero = 0, i = 1000;
    double saldo = 0;

    
    
    public void inserir(){ //Inserir um pedal novo na ArrayList
        System.out.println("Digite o tipo de conta que deseja criar:\n 1 - PedalPop\t 2 - PedalPremium");
        numero = Integer.parseInt(scan.nextLine());
        
        if(numero == 1){
        	PedalPop pPop = new PedalPop();
        	listaPedais.add(pPop);
        	//dinheiro investido
        	System.out.println("Digite a quantidade que deseja depositar:");
        	saldo = Double.parseDouble(scan.nextLine());
        	pPop.setCarteira(saldo);
        	//n�mero da conta
        	i++;
        	pPop.setConta(i);
        	numero =0;
        }
        else if(numero == 2){
           PedalPremium pPremium = new PedalPremium();
           listaPedais.add(pPremium);
           //dinheiro investido
           System.out.println("Digite a quantidade que deseja depositar: (minimo de 100 reais)");
           saldo = scan.nextDouble();
           pPremium.setCarteira(saldo);
           //n�mero da conta
           i++;
           pPremium.setConta(i);
           numero =0;
        }else{
            System.out.println("Op��o inv�lida"); 
        }
    }

    
    public void remover(int num){ //Remover um pedal da ArrayList pelo n�mero da conta
    	int d = 0;
    	while  (d < listaPedais.size() ) {
            if(listaPedais.get(d).getConta() == num)
            	listaPedais.remove(d);
            d++;
    	}
    }
    
	public ContaUrbanBike procurarPedal(int num){
    	int d = 0;
    	while  (d < listaPedais.size() ) {
            if(listaPedais.get(d).getConta() == num)
            	System.out.println(listaPedais.get(d).getConta());
            	System.out.println(listaPedais.get(d).getCarteira());
            	d++;
            	return null;
    		}
        return null;
        }
	
	
	@Override
	public void mostraDados() {
			
	}
	
	
	public void menu1() { // Menu da Aplica��o
		int opcao = 0;
		do {
			System.out.println("\n          ========================================");
			System.out.println("          1 - Criar pedal        "); 
			System.out.println("          2 - Remover Pedal      ");
			System.out.println("          3 - Gerar relat�rio    ");
			System.out.println("          4 - Selecionar Pedal      ");
			System.out.println("          5 - Finalizar ");
			System.out.println("          ========================================\n");			
				Scanner scanMenu = new Scanner(System.in);
				opcao = Integer.parseInt(scanMenu.nextLine());
			switch (opcao) {
			case 1:
				inserir(); 
			break;
			case 2:
				System.out.println("Digite o c�digo da conta que deseja remover:");
				numero = Integer.parseInt(scan.nextLine());
                remover(numero);
			break;
		    case 3:
		    	gerarRelatorio(listaPedais);
            break;
		    case 4:
		    	System.out.println("Digite o c�digo da conta que deseja selecionar:");
		    	numero = Integer.parseInt(scan.nextLine());
            break;
			case 5:
				
            break;
			case 6:
		        	if (listaPedais.isEmpty()== true) {
		        		System.out.println("A lista est� vazia!");
		        	}else {
		        		int d= 0;
                            while  (d < listaPedais.size() ) {
                                System.out.println(listaPedais.get(d).getCarteira());
                                System.out.println(listaPedais.get(d).getConta());
                                System.out.println(listaPedais);
                                d++;
                            }
		        		}
		    break;
		    
				default:
            System.out.println("Op��o Inv�lida!");
            break;
            }
        } while (opcao != 0);
    }
	
	public void menu2() { // Menu da op��o 4
		int opcao = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          A - Creditar        "); 
			System.out.println("          B - Pedalar      ");
			System.out.println("          C - Transferir    ");
			System.out.println("          D - Gerar relat�rio      ");
			System.out.println("          E - Retornar ao menu anterior ");
			System.out.println("          ========================================\n");			
            	opcao = Integer.parseInt(scanMenu.nextLine());
			switch (opcao) {
			case 1:
                            ;
			break;
		        case 2:
                            ;
			break;
		        case 3:
                           	;
            break;
		        case 4:
                           	;
            break;
				case 0:
            break;
				default:
            System.out.println("Op��o inv�lida!");
            break;
            }
        } while (opcao != 0);
    }
}
