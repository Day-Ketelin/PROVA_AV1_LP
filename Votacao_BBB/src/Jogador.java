import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    public String jogador;
    public String voto;

    public Jogador(String jogador) {
        this.jogador = jogador;
        this.voto = voto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jogador = new ArrayList<String>();
        jogador.add("Alane Dias\n");
        jogador.add("Beatriz Reis\n");
        jogador.add("Davi Brito\n");
        jogador.add("Deniziane Ferreira\n");
        jogador.add("Fernanda Bande\n");
        jogador.add("Giovanna Lima\n");
        jogador.add("Giovanna Pitel\n");
        jogador.add("Isabelle Nogueira\n");
        jogador.add("Juninho\n");
        jogador.add("Leidy Elin\n");
        jogador.add("Lucas Henrique\n");
        jogador.add("Lucas Luigi\n");
        jogador.add("Lucas Pizane\n");
        jogador.add("Marcus Vinicius\n");
        jogador.add("Matteus Amaral\n");
        jogador.add("Maycon Cosmer\n");
        jogador.add("MC Bin Laden\n");
        jogador.add("Michel Nogueira\n");
        jogador.add("Nizam\n");
        jogador.add("Raquele Cardozo\n");
        jogador.add("Rodriguinho\n");
        jogador.add("Thalyta Alves\n");
        jogador.add("Vanessa Lopes\n");
        jogador.add("Vinicius Rodrigues\n");
        jogador.add("Wanessa Camargo\n");
        jogador.add("Yasmin Brunet\n");

        System.out.print("Jogadores:" + jogador);

        String opcao = "null";
        do {
            System.out.println("Novo voto.");

            opcao = scanner.nextLine();

            if (opcao.equals("")) {
                System.out.println("Em quem você vota para sair da casa?");
                scanner.nextLine();
                String voto = scanner.nextLine();

            } else if (opcao.equals("Sair")) {

            }


        } while (jogador.equals(""));

    }
}
