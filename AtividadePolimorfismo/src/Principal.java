import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Produto []p= new Produto[10];
		int n=0;
		int cont=0;
		do {
		    try
		    {
		        final String os = System.getProperty("os.name");

		        if (os.contains("Windows"))
		        {
		            Runtime.getRuntime().exec("cls");
		        }
		        else
		        {
		            Runtime.getRuntime().exec("clear");
		        }
		    }
		    catch (final Exception e)
		    {
		        //  Handle any exceptions.
		    }
			System.out.println("Escolha uma das opções:");
			System.out.println("1: Cadastrar produto");
			System.out.println("2: Listar produtos");
			System.out.println("3: Cadastrar livro");
			System.out.println("4: Listar livros");
			System.out.println("5: Imprimir tudo");
			System.out.println("6: Sair");
			n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Digite o nome, a descrição e o preço");
				p[cont]= new Produto(sc.next(), sc.next(), sc.nextDouble());
				cont++;
				break;
			case 2:
				for(int i=0;i<cont;i++) {
					if(p[i] instanceof Produto)	System.out.println(p[i].toString());
				}
				break;
			case 3:
				System.out.println("Digite o nome, a descrição, o preço, autores, ISBN e editora");
				p[cont]= new Livro(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.next());
				cont++;
				break;
			case 4:
				for(int i=0;i<cont;i++) {
					if(p[i] instanceof Livro)	System.out.println(p[i].toString());
				}
				break;
			case 5:
				for(int i=0;i<cont;i++) {
					System.out.println(p[i].toString());
				}
				break;
			case 6:
				n=0;
				break;
			default:
				System.out.println("Opção invalida!");
				break;
			}

		}while(n!=0);
	}

}
