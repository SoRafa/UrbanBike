package urbanbike;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ciclistas implements Imprimivel{
	
	ArrayList<PedalPop> listaPop = new ArrayList<PedalPop>();
	ArrayList<PedalPremium> listaPremium = new ArrayList<PedalPremium>();
	Iterator itPop = listaPop.iterator( );
	Iterator itPremium = listaPremium.iterator( );


	public void inserir(){
		listaPop.add();
		}

	public void remover(){
		listaPop.remove();	
	}
	
	public void procurarPedal(){
		listaPop.remove();
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
			Scanner scan = new Scanner(System.in);
                        opcao = Integer.parseInt(scan.nextLine());
			switch (opcao) {
			case 1://debug
				while ( itPop.hasNext( ) ) {
					System.out.println( itPop.next( ) );
					}
				while ( itPremium.hasNext( ) ) {
					System.out.println( itPremium.next( ) );
					}
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
			Scanner scan = new Scanner(System.in);
                        opcao = Integer.parseInt(scan.nextLine());
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
