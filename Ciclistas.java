package urbanbike;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ciclistas implements Imprimivel{
	
    ArrayList<ContaUrbanBike> listaPedais = new ArrayList<>();
    Iterator<ContaUrbanBike> itPedais = listaPedais.iterator();
    Scanner scan = new Scanner(System.in);
    int numero = 0;
    double saldo = 0;
    
    public void inserir(){
        System.out.println("Digite o tipo de conta que deseja criar: 1 - PedalPop\t 2 - PedalPremium");
        numero = Integer.parseInt(scan.nextLine());
        if(numero == 1){
           PedalPop Pedal = new PedalPop();
           System.out.println("Digite a quantidade que deseja depositar:");
           saldo = scan.nextDouble();
           Pedal.setCarteira(saldo);
           int i = 0; i++;
           Pedal.setConta(i);
        }
        else if(numero == 2){
           PedalPremium Pedal = new PedalPremium();
           System.out.println("Digite a quantidade que deseja depositar: (minimo de "+ Pedal.getLimite()+"reais)");
           saldo = scan.nextDouble();
           Pedal.setCarteira(saldo);
           int i = 0; i++;
           Pedal.setConta(i);
        }else{
            System.out.println("Opção inválida"); 
        }
	System.out.println("Digite a quantidade que deseja depositar:");
	listaPedais.add();
	}

    public void remover(ContaUrbanBike c){
	while ( itPedais.hasNext() ) {                              
            System.out.println(itPedais.next().getConta());
            if( itPedais.next() == c) {
                listaPedais.remove(itPedais.next());
                }
            }
        }

	public ContaUrbanBike procurarPedal(int num){
		while ( itPedais.hasNext() ) {				//laço para pesquisar 
			if( itPedais.next().getConta() == numero) {
                            System.out.println(itPedais.next().getConta());
                            return itPedais.next();
                        }
	}
        return null;
    }
	
	@Override
	public void mostraDados() {
			
	}
	
	public void menu1() { // Menu da Aplicação
		int opcao = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          1 - Criar pedal        "); 
			System.out.println("          2 - Remover Pedal      ");
			System.out.println("          3 - Gerar relatório    ");
			System.out.println("          4 - Selecionar Pedal      ");
			System.out.println("          5 - Finalizar ");
			System.out.println("          ========================================\n");			
				Scanner scan1 = new Scanner(System.in);
                opcao = Integer.parseInt(scan1.nextLine());
			switch (opcao) {
			case 1://debug
                        numero = Integer.parseInt(scan.nextLine()); 
				while ( itPedais.hasNext( ) ) {
					System.out.println( itPedais.next( ) );
					}
			break;
		        case 2:
                        numero = Integer.parseInt(scan.nextLine()); 
                            ;
			break;
		        case 3:
                        numero = Integer.parseInt(scan.nextLine()); 
                           	;
            break;
		        case 4:
                           	;
            break;
				case 0:
            break;
				default:
            System.out.println("Opção Inválida!");
            break;
            }
        } while (opcao != 0);
    }
	
	public void menu2() { // Menu da opção 4
		int opcao = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          A - Creditar        "); 
			System.out.println("          B - Pedalar      ");
			System.out.println("          C - Transferir    ");
			System.out.println("          D - Gerar relatório      ");
			System.out.println("          E - Retornar ao menu anterior ");
			System.out.println("          ========================================\n");			
                Scanner scan2 = new Scanner(System.in);
            	opcao = Integer.parseInt(scan2.nextLine());
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
            System.out.println("Opção Inválida!");
            break;
            }
        } while (opcao != 0);
    }
}
