package urbanbike;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ciclistas implements Imprimivel{
	
	ArrayList<PedalPop> listaPop = new ArrayList<PedalPop>();
	ArrayList<PedalPremium> listaPremium = new ArrayList<PedalPremium>();
	Iterator<PedalPop> itPop = listaPop.iterator( );
	Iterator<PedalPremium> itPremium = listaPremium.iterator( );
	Scanner scan = new Scanner(System.in);
	int numero = 0;
	
	public void inserir(){
		System.out.println("digite");
		System.out.println("");
		listaPop.add();
		}

	public void remover(){
		numero = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < listaPop.size(); i++) { 
			
			while ( itPop.hasNext() ) {						//la�o para pesquisar no pop
				System.out.println(itPop.next().getConta());
				if( itPop.next().getConta() == numero) {
					listaPop.remove(i);
					}
				}
				while ( itPremium.hasNext() ) {				//la�o para pesquisar no premium
					System.out.println(itPremium.next().getConta());
					if( itPremium.next().getConta() == numero) {
					listaPremium.remove(i);
					}
				}
			}
		}

	public void procurarPedal(){
		numero = Integer.parseInt(scan.nextLine());
			for(int i = 0; i < listaPop.size(); i++) { 
			
			while ( itPop.hasNext() ) {						//la�o para pesquisar no pop
				System.out.println(itPop.next().getConta());
				if( itPop.next().getConta() == numero) {
					listaPop.get(i);
					}
				}
				while ( itPremium.hasNext() ) {				//la�o para pesquisar no premium
					System.out.println(itPremium.next().getConta());
					if( itPremium.next().getConta() == numero) {
					listaPremium.get(i);
					}
				}
			}
		}
	
	@Override
	public void mostraDados() {
			
	}
	
	public void menu1() { // Menu da Aplica��o
		int opcao = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          1 - Criar pedal        "); 
			System.out.println("          2 - Remover Pedal      ");
			System.out.println("          3 - Gerar relat�rio    ");
			System.out.println("          4 - Selecionar Pedal      ");
			System.out.println("          5 - Finalizar ");
			System.out.println("          ========================================\n");			
				Scanner scan1 = new Scanner(System.in);
                opcao = Integer.parseInt(scan1.nextLine());
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
            System.out.println("Op��o Inv�lida!");
            break;
            }
        } while (opcao != 0);
    }
}
