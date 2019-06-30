package urbanbike;
import java.util.Scanner;
import java.util.ArrayList;

public class Ciclistas implements Imprimivel{
	
    ArrayList<ContaUrbanBike> listaPedais = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Scanner scanMenu = new Scanner(System.in);

    int numero = 0, i = 0;
    double saldo = 0;

    
    public void inserir(){
        System.out.println("Digite o tipo de conta que deseja criar: 1 - PedalPop\t 2 - PedalPremium");
        numero = Integer.parseInt(scan.nextLine());
        
        if(numero == 1){
        	PedalPop Pedal = new PedalPop();
        	listaPedais.add(Pedal);
        	//dinheiro investido
        	System.out.println("Digite a quantidade que deseja depositar:");
        	saldo = Double.parseDouble(scan.nextLine());
        	Pedal.setCarteira(saldo);
        	//número da conta
        	i++;
        	Pedal.setConta(i);
            System.out.println(""+i);
        	numero =0;
        }
        else if(numero == 2){
           PedalPremium Pedal = new PedalPremium();
           listaPedais.add(Pedal);
           //dinheiro investido
           System.out.println("Digite a quantidade que deseja depositar: (minimo de "+ Pedal.getLimite()+"reais)");
           saldo = scan.nextDouble();
           Pedal.setCarteira(saldo);
           //número da conta
           i++;
           Pedal.setConta(i);
           numero =0;
        }else{
            System.out.println("Opção inválida"); 
        }
    }

    public void remover(int num){
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
				Scanner scanMenu = new Scanner(System.in);
				opcao = Integer.parseInt(scanMenu.nextLine());
			switch (opcao) {
			case 1:
                            inserir(); 
			break;
		        case 2:
                            numero = scan.nextInt();
                            remover(numero);
			break;
		        case 3:
                        numero = scan.nextInt(); ;
            break;
		        case 4:
		        	if (listaPedais.isEmpty()== true) {
		        		System.out.println("A lista está vazia!");
		        	}else {
		        		int d= 0;
                            while  (d < listaPedais.size() ) {
                                System.out.println(listaPedais.get(d).getCarteira());
                                System.out.println(listaPedais.get(d).getConta());
                                d++;
                            }
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
			System.out.println("          D - Gerar relatório      ");
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
            System.out.println("Opção inválida!");
            break;
            }
        } while (opcao != 0);
    }
}
