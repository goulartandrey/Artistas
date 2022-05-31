package app;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gravadora g1 = new Gravadora();
		int op;
		do {
			System.out.println("Escolha a opção desejada:\n1-Cadastrar artista:\n2-Visualizar artista:\n3-Quantidade de artistas cadastrados:\n"
					+ "4-Apagar todos os artistas:\n5-Ver total de artistas:\n6-Sair.");
			op=sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				Artista a1 = new Artista();
				System.out.println("Digite o nome do artista/banda:");
				a1.setNome(sc.nextLine());
				g1.armazenar(a1);
				System.out.println("Armazenado com sucesso!");
			break;
			case 2:
				System.out.println("Digite o nome do artista/banda: ");
				String nome = sc.nextLine();
				
				
			break;
			case 3:
				System.out.println(g1.getLista());
			break;
			case 4:
				int confirma;
				System.out.println("Tem certeza que deseja excluirtudo? 1-SIM 2-NAO");
				confirma  = sc.nextInt();
				if (confirma==1) {
					g1.apagarLista();
					System.out.println("Lista apagada!");
				}else {
					System.out.println("Cancelado.");
				}
			break;
			case 5:
				System.out.println("Total de artistas cadastrados: " + g1.qtdArtistas());
			}
		}while(op!=6);

	}

}
