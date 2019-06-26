package urbanbike;

public class Ciclistas implements Imprimivel{

	public class inserir{
		
	}
	
	public class remover{
		
	}
	
	public class procurarPedal{
	
	}
	
	@Override
	public void mostraDados() {
		 System.out.println("Número da conta: " +getConta()); 
		 System.out.println("Valor na carteira: " +getCarteira());
		
	}
	public void menu() { // menu principal
		int opcao = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          1 - Aumentar canal        "); 
			System.out.println("          2 - Diminuir canal      ");
			System.out.println("          3 - Aumentar volume    ");
			System.out.println("          4 - Diminuir volume      ");
			System.out.println("          5 - Exibir canal e volume da televisão ");
			System.out.println("          0 - Sair          ");
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
				case 5:
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
