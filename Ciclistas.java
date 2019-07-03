package urbanbike;
import java.util.Scanner;
import java.util.ArrayList;

public class Ciclistas extends Relatorio implements Imprimivel{
    ArrayList<ContaUrbanBike> listaPedais = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Scanner scanMenu = new Scanner(System.in);
    int numero = 0, i = 1000;
    double creditoInicial = 0;

    
    
    public void inserir(){ //Inserir um pedal novo na ArrayList
        System.out.println("Digite o tipo de conta que deseja criar:\n 1 - PedalPop\t 2 - PedalPremium");
        numero = Integer.parseInt(scan.nextLine());
        
        if(numero == 1){
        	PedalPop pPop = new PedalPop();
        	listaPedais.add(pPop);
        	//dinheiro investido
        	System.out.println("Digite a quantidade que deseja depositar:");
        	creditoInicial = Double.parseDouble(scan.nextLine());
        	pPop.setCarteira(creditoInicial);
        	//número da conta
        	i++;
        	pPop.setConta(i);
        	//tipo de conta
        	pPop.setTipoDeConta("PedalPop");
            System.out.println("Pedal Adicionado com Sucesso! O número da sua conta é: "+ i);
            numero = 0;
        }
        else if(numero == 2){
           PedalPremium pPremium = new PedalPremium();
           listaPedais.add(pPremium);
           //dinheiro investido
           System.out.println("Digite a quantidade que deseja depositar: (minimo de 100 reais)");
           creditoInicial = Double.parseDouble(scan.nextLine());
           pPremium.setCarteira(creditoInicial);
           //número da conta
           i++;
           pPremium.setConta(i);
           //tipo de conta
           pPremium.setTipoDeConta("PedalPremium");
           System.out.println("Pedal Adicionado com Sucesso! O número da sua conta é: "+ i);
           numero = 0;
        }else{
            System.out.println("Opção inválida"); 
        }
    }

    
    public void remover(int cod){ //Remover um pedal da ArrayList pelo número da conta
    	int d = 0;
    	while  (d < listaPedais.size() ) {
            if(listaPedais.get(d).getConta() == cod)
            	listaPedais.remove(d);
            d++;
    	}
    }
    
	public void procurarPedal(int cod){ // Procurar um Pedal e exibir o segundo menu, caso exista
	        int cont = 0;
	        for(ContaUrbanBike p : listaPedais){
	            if(p.getConta() == cod){
	            System.out.println("\n	 ======================================");
	            System.out.println("	 Tipo da conta: " + p.getTipoDeConta());
	            System.out.println("	 codigo: " + p.getConta());
	            System.out.println("	 Saldo: R$" + p.getCarteira());
	            System.out.println("	 ======================================");
	            cont = 1;
	            menu2(p);
	            }
	        }
	        if(cont == 0){
	            System.out.println("O código que foi digitado, não foi encontrado...");
	            return;
	        }
	    }
	
	@Override
	public void mostraDados() {
		 System.out.println("Número da conta: " + listaPedais.get(i).getConta()); 
		 System.out.println("Tipo da conta: " + listaPedais.get(i).getCarteira()); 
		 System.out.println("Valor na carteira: " + listaPedais.get(i).getTipoDeConta());
	}
	
	
	public void menu() { // Menu da Aplicação
		int opcao = 0;
		do {
			System.out.println("\n          ========================================");
			System.out.println("          1 - Criar pedal        "); 
			System.out.println("          2 - Remover Pedal      ");
			System.out.println("          3 - Gerar relatório    ");
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
	        	if (listaPedais.isEmpty() == true) {
	        		System.out.println("A lista está vazia!");
		    		break;	}
				System.out.println("Digite o código da conta que deseja remover:");
				numero = Integer.parseInt(scan.nextLine());
                remover(numero);
                break;
                
		    case 3:
	        	if (listaPedais.isEmpty() == true) {
	        		System.out.println("A lista está vazia!");
	        		break;	}
		    	gerarRelatorio(listaPedais);
		    	break;
		    	
		    case 4:
	        	if (listaPedais.isEmpty() == true) {
	        		System.out.println("A lista está vazia!");
	        		break;	}
		    	System.out.println("Digite o código da conta que deseja selecionar:");
		    	numero = Integer.parseInt(scan.nextLine());
		    	procurarPedal(numero);
		    	break;
		    	
			case 5:
				System.exit(1);
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
        } while (opcao != 0);
    }
	
	public void menu2(ContaUrbanBike p) { // Menu da opção 4
		int opcao = 0;
		double credito = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          1 - Creditar        "); 
			System.out.println("          2 - Pedalar      ");
			System.out.println("          3 - Transferir    ");
			System.out.println("          4 - Gerar relatório      ");
			System.out.println("          5 - Retornar ao menu anterior ");
			System.out.println("          ========================================\n");			
			Scanner scanMenu = new Scanner(System.in);
			opcao = Integer.parseInt(scanMenu.nextLine());
			switch (opcao) {
				case 1:
					System.out.println("Digite o valor que deseja depositar:");
					credito = Double.parseDouble(scan.nextLine());
					p.depositarCredito(credito);
				break;
				
				case 2:
					System.out.println("Digite a quantidade de quilometros estimada:");
					credito = Double.parseDouble(scan.nextLine());
					p.gastarCredito(credito);
                break;
                
		        case 3:
		        	
                break;
                
		        case 4:
		        	System.out.println("          Número da conta: " + p.getConta());
		        	System.out.println("          Tipo da conta: " + p.getTipoDeConta());
		        	System.out.println("          Valor na carteira: R$" + p.getCarteira());
                break;
                
		        case 5:
		        	menu();
                break;
                
				default:
            System.out.println("Opção inválida!");
            break;
            }
        } while (opcao != 0);
    }
}
