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
           listaPedais.add(Pedal);
        }
        else if(numero == 2){
           PedalPremium Pedal = new PedalPremium();
           System.out.println("Digite a quantidade que deseja depositar: (minimo de "+ Pedal.getLimite()+"reais)");
           saldo = scan.nextDouble();
           Pedal.setCarteira(saldo);
           int i = 0; i++;
           Pedal.setConta(i);
           listaPedais.add(Pedal);
        }else{
            System.out.println("Opção inválida"); 
        }
    }

    public void remover(int num){
	while ( itPedais.hasNext() ) {                              
            System.out.println(itPedais.next().getConta());
            if( itPedais.next().getConta() == num) {
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
        return null;    }
	
	@Override
	public void mostraDados() {
			
	}
	
	public void menu1() { // Menu da Aplicação
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
                            opcao = scan1.nextInt();
			switch (opcao) {
			case 1:
                            inserir(); 
			break;
		        case 2:
                            numero = scan.nextInt();
                            remover(numero);
			break;
		        case 3:
                        numero = Integer.parseInt(scan.nextLine()); 
                           	;
            break;
		        case 4:
                            while ( itPedais.hasNext() ) {
                                System.out.println(itPedais.next());
                            }
            break;
				case 5:
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
            System.out.println("Opção Inválida!");
            break;
            }
        } while (opcao != 0);
    }
}
