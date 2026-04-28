import java.util.Scanner;

public class GlenderPts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n=6,m=8;
                int[][] cinema = new int[n][m];
                for(int mb=0;  mb<999; mb++) {
                    double porcentagem = 0, oculpados = 0;
                    System.out.println("Bem vindo meu compatriota quer assistir aquele lolzin de alto nivel na arena cblol?\n" +
                            "Tudo bem entao entao em diga qual açao quer tomar?\n" +
                            "1 - Reservar assento\n" +
                            "2 - Cancelar reserva\n" +
                            "3 - Exibir mapa da sala\n" +
                            "4 - Exibir quantidade de assentos livres e ocupados\n" +
                            "5 - Encerrar\n");

                    int escolha = sc.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Que maravilha na arena temos um total de 6 colunas e 8 acentos cada qual acento gostaria de assistir o espetaculo?\n" + "Coluna:");
                            n = sc.nextInt();
                            System.out.println("Qual acento?");
                            m = sc.nextInt();
                            if (cinema[n-1][m-1] != 1) {
                                cinema[n-1][m-1] = 1;

                            } else {
                                System.out.println("Acento1 oculpado - Selecione outro, em caso de duvidas va a seçao: Exibir mapa da sala.");

                            }

                            break;
                        case 2:
                            System.out.println("E uma pena, mas emprevistos acontecem qual acento gostaria de cancelar??\n" + "Coluna:");
                            n = sc.nextInt();
                            System.out.println("Qual acento?");
                            m = sc.nextInt();
                            if (cinema[n-1][m-1] == 1) {
                                cinema[n-1][m-1] = 0;

                            } else {
                                System.out.println("Nao a reservas neste acento, ouve algum erro?.");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Fileira" + " " + (i + 1) + ":");
                                for (int j = 0; j < 7; j++) {
                                    System.out.print((cinema[i][j]) + " ");
                                }
                                System.out.println(" ");
                            }
                            break;

                        case 4:
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 7; j++) {
                                    if (cinema[i][j] == 1) {
                                        oculpados = oculpados + 1;
                                    }
                                }
                                porcentagem = oculpados/48 * 100;
                                System.out.println("Assentos livres:" +" " +  (48-oculpados) +
                                        "\nAssentos ocupados:" +" " + oculpados +
                                        "\nPercentual de ocupaçao:" +" " +porcentagem + "%");
                            }
                            break;
                        case 5:
                            System.out.println("Obrigado pela consideraçao! Volte sempre");

                        default:
                            System.out.println("Opçao invalida!");
                            return;


                    }
                    System.out.println(" ");
                }
            }
        }

