import java.util.Scanner;

public class SistemaSentinela {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);


        System.out.print("Informe o nome do profissional: ");
        String nome = entrada.nextLine();

         System.out.print("Informe o cargo (Cientista, Engenheiro, Zelador, Administrativo): ");
         String cargo = entrada.nextLine();

         System.out.print("Informe o nível de acesso (1 a 10): ");
         int nivelAcesso = entrada.nextInt();

          System.out.print("Informe o nível de sigilo da área: ");
          int nivelSigilo = entrada.nextInt();

          System.out.println("\n-------------------------------------------");


          if (nivelAcesso < 1 || nivelAcesso > 10) {
          System.out.println("Erro: Nível de acesso inválido.");
         } else {

               System.out.println("Profissional: " + nome);
               System.out.println("Cargo: " + cargo);


                if (nivelAcesso >= nivelSigilo) {
                System.out.println("Resultado: ACESSO PERMITIDO");


                  int nivelAutoridade = nivelAcesso - nivelSigilo;
                  System.out.println("Nível de Autoridade: " + nivelAutoridade);
                 } else {
                 System.out.println("Resultado: ACESSO NEGADO");
                  }



                    if (nivelAcesso < 3 && nivelSigilo > 7) {
                    System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
                    }
                  }

                  System.out.println("-------------------------------------------");

                 entrada.close();
}
}