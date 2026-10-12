import java.util.Scanner;


public class CorrecaoProva {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] eleitores = new int[5];
        int[] federal = new int[3];
        int[] estadual = new int[3];
        int[] senador = new int[3];
        int[] governador = new int[3];
        int[] presidente = new int[3];

        int eleitor = 0;
        int votoFederal =0;
        int votoEstadual =0;
        int votoSenador =0;
        int votoGovernador =0;
        int votoPresidente =0;

        int controleVoto = 0;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Escolha opção desejada");
            System.out.println("1- Inicar Votação");
            System.out.println("2- Consultar voto de um eleitor");
            System.out.println("3- Exibir Resultado");
            System.out.println("4- Mostar Vencedores");
            System.out.println("0- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("FINALIZADO");
                    break;

                case 1:
                    System.out.println("Digite numero eleitor: ");
                    eleitor = sc.nextInt();
                    if (eleitor != 1001 && eleitor != 1002 && eleitor != 1003 && eleitor != 1004 && eleitor != 1005) {
                        System.out.println("ELEITOR INVALIDO");
                        break;
                    }


                    for (int i = 0; i < eleitores.length; i++) {
                        if (eleitores[i] == eleitor) {
                            System.out.println("Eleitor Existente !");
                            break;
                        }
                    }

                    eleitores[controleVoto] = eleitor;

                    boolean candidatoValido = true;
                    do {
                        System.out.println("José Bombinha -  101");
                        System.out.println("Ana Silva - 102");
                        System.out.println("Carlos Lima - 103");
                        System.out.println("Qual seu Voto para Deputado Federal");
                        votoFederal = sc.nextInt();

                        if (votoFederal != 101 && votoFederal != 102 && votoFederal != 103) {
                            System.out.println("DEPUTADO FEDERAL INCORRETO");
                            candidatoValido = false;
                        } else {
                            federal[controleVoto] = votoFederal;
                            candidatoValido = true;
                        }

                    } while (candidatoValido == false);


                    do {
                        System.out.println("Taffe da Galera - 201");
                        System.out.println("Rodrigo Pato Depenado - 202");
                        System.out.println("Mariana Costa - 203");
                        System.out.println("Qual seu voto para Deputado Estadual?");
                        votoEstadual = sc.nextInt();

                        if (votoEstadual != 201 && votoEstadual != 202 && votoEstadual != 203) {
                            System.out.println("DEPUTADO ESTADUAL INCORRETO");
                            candidatoValido = false;
                        } else {
                            estadual[controleVoto] = votoEstadual;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    do {
                        System.out.println("Huilson Clone - 301");
                        System.out.println("Juliana Rocha - 302");
                        System.out.println("Roberto Martins - 303");
                        System.out.println("Qual seu voto para Senador?");
                        votoSenador = sc.nextInt();

                        if (votoSenador != 301 && votoSenador != 302 && votoSenador != 303) {
                            System.out.println("SENADOR INCORRETO");
                            candidatoValido = false;
                        } else {
                            senador[controleVoto] = votoSenador;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    do {
                        System.out.println("Patrick Cobra - 401");
                        System.out.println("Fernanda Souza - 402");
                        System.out.println("Ricardo Oliveira - 403");
                        System.out.println("Qual seu voto para Governador");
                        votoGovernador = sc.nextInt();

                        if (votoGovernador != 401 && votoGovernador != 402 && votoGovernador != 403) {
                            System.out.println("GOVERNADOR INCORRETO");
                            candidatoValido = false;
                        } else {
                            governador[controleVoto] = votoGovernador;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    do {
                        System.out.println("Carl Johnson - 501");
                        System.out.println("Alessandro das Redes - 502");
                        System.out.println("Lucas Ferreira - 503");
                        System.out.println("Qual seu voto para Presidente?");
                        votoPresidente = sc.nextInt();

                        if (votoPresidente != 501 && votoPresidente != 502 && votoPresidente != 503) {
                            System.out.println("PRESIDENTE INCORRETO");
                            candidatoValido = false;
                        } else {
                            presidente[controleVoto] = votoPresidente;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    controleVoto++;

                    break;

                case 2:

                    System.out.println("Digite numero eleitor: ");
                    eleitor = sc.nextInt();

                    if (eleitor != 1001 && eleitor != 1002 &&
                            eleitor != 1003 && eleitor != 1004 &&
                            eleitor != 1005) {

                        System.out.println("ELEITOR INVALIDO");
                        break;
                    }

                    int posicaoConsulta = -1;

                    for (int i = 0; i < controleVoto; i++) {
                        if (eleitores[i] == eleitor) {
                            posicaoConsulta = i;
                            break;
                        }
                    }
                    if (posicaoConsulta == -1) {
                        System.out.println("Eleitor ainda nao votou!");
                    } else {
                        System.out.println("Deputado Federal: " + federal[posicaoConsulta]);
                        System.out.println("Deputado Estadual: " + estadual[posicaoConsulta]);
                        System.out.println("Senador: " + senador[posicaoConsulta]);
                        System.out.println("Governador: " + governador[posicaoConsulta]);
                        System.out.println("Presidente: " + presidente[posicaoConsulta]);
                    }

                    break;

                case 3:

                    if (controleVoto == 0) {
                        System.out.println("AINDA NAO HA VOTOS REGISTRADOS!");
                        break;
                    }

                    System.out.println("\nDEPUTADO FEDERAL:");

                    for (int i = 101; i <= 103; i++) {
                        int quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (federal[j] == i) {
                                quantidade++;
                            }
                        }

                        if (i == 101) {
                            System.out.println("Jose Bombinha: " + quantidade + " voto(s)");
                        } else if (i == 102) {
                            System.out.println("Ana Silva: " + quantidade + " voto(s)");
                        } else {
                            System.out.println("Carlos Lima: " + quantidade + " voto(s)");
                        }
                    }

                    System.out.println("\nDEPUTADO ESTADUAL:");

                    for (int i = 201; i <= 203; i++) {
                        int quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (estadual[j] == i) {
                                quantidade++;
                            }
                        }

                        if (i == 201) {
                            System.out.println("Taffe da Galera: " + quantidade + " voto(s)");
                        } else if (i == 202) {
                            System.out.println("Rodrigo Pato Depenado: " + quantidade + " voto(s)");
                        } else {
                            System.out.println("Mariana Costa: " + quantidade + " voto(s)");
                        }
                    }

                    System.out.println("\nSENADOR:");

                    for (int i = 301; i <= 303; i++) {
                        int quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (senador[j] == i) {
                                quantidade++;
                            }
                        }

                        if (i == 301) {
                            System.out.println("Huilson Clone: " + quantidade + " voto(s)");
                        } else if (i == 302) {
                            System.out.println("Juliana Rocha: " + quantidade + " voto(s)");
                        } else {
                            System.out.println("Roberto Martins: " + quantidade + " voto(s)");
                        }
                    }

                    System.out.println("\nGOVERNADOR:");

                    for (int i = 401; i <= 403; i++) {
                        int quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (governador[j] == i) {
                                quantidade++;
                            }
                        }

                        if (i == 401) {
                            System.out.println("Patrick Cobra: " + quantidade + " voto(s)");
                        } else if (i == 402) {
                            System.out.println("Fernanda Souza: " + quantidade + " voto(s)");
                        } else {
                            System.out.println("Ricardo Oliveira: " + quantidade + " voto(s)");
                        }
                    }

                    System.out.println("\nPRESIDENTE:");

                    for (int i = 501; i <= 503; i++) {
                        int quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (presidente[j] == i) {
                                quantidade++;
                            }
                        }

                        if (i == 501) {
                            System.out.println("Carl Johnson: " + quantidade + " voto(s)");
                        } else if (i == 502) {
                            System.out.println("Alessandro das Redes: " + quantidade + " voto(s)");
                        } else {
                            System.out.println("Lucas Ferreira: " + quantidade + " voto(s)");
                        }
                    }

                    break;

                case 4:

                    if (controleVoto == 0) {
                        System.out.println("AINDA NAO HA VOTOS REGISTRADOS!");
                        break;
                    }

                    int maior;
                    int quantidade;

                    System.out.println("\nVENCEDOR - DEPUTADO FEDERAL:");

                    maior = 0;

                    for (int i = 101; i <= 103; i++) {
                        quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (federal[j] == i) {
                                quantidade++;
                            }
                        }

                        if (quantidade > maior) {
                            maior = quantidade;
                        }
                    }

                    for (int i = 101; i <= 103; i++) {
                        quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (federal[j] == i) {
                                quantidade++;
                            }
                        }

                        if (quantidade == maior) {
                            if (i == 101) {
                                System.out.println("Jose Bombinha - " + quantidade + " voto(s)");
                            } else if (i == 102) {
                                System.out.println("Ana Silva - " + quantidade + " voto(s)");
                            } else {
                                System.out.println("Carlos Lima - " + quantidade + " voto(s)");
                            }
                        }
                    }

                    System.out.println("\nVENCEDOR - DEPUTADO ESTADUAL:");

                    maior = 0;

                    for (int i = 201; i <= 203; i++) {
                        quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (estadual[j] == i) {
                                quantidade++;
                            }
                        }

                        if (quantidade > maior) {
                            maior = quantidade;
                        }
                    }

                    for (int i = 201; i <= 203; i++) {
                        quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (estadual[j] == i) {
                                quantidade++;
                            }
                        }

                        if (quantidade == maior) {
                            if (i == 201) {
                                System.out.println("Taffe da Galera - " + quantidade + " voto(s)");
                            } else if (i == 202) {
                                System.out.println("Rodrigo Pato Depenado - " + quantidade + " voto(s)");
                            } else {
                                System.out.println("Mariana Costa - " + quantidade + " voto(s)");
                            }
                        }
                    }

                    System.out.println("\nVENCEDOR - SENADOR:");

                    maior = 0;
                    for (int i = 301; i <= 303; i++) {
                        quantidade = 0;
                        for (int j = 0; j < controleVoto; j++) {
                            if (senador[j] == i) {
                                quantidade++;
                            }
                        }
                        if (quantidade > maior) {
                            maior = quantidade;
                        }
                    }
                    for (int i = 301; i <= 303; i++) {
                        quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (senador[j] == i) {
                                quantidade++;
                            }
                        }
                        if (quantidade == maior) {
                            if (i == 301) {
                                System.out.println("Huilson Clone - " + quantidade + " voto(s)");
                            } else if (i == 302) {
                                System.out.println("Juliana Rocha - " + quantidade + " voto(s)");
                            } else {
                                System.out.println("Roberto Martins - " + quantidade + " voto(s)");
                            }
                        }
                    }

                    System.out.println("\nVENCEDOR - GOVERNADOR:");

                    maior = 0;
                    for (int i = 401; i <= 403; i++) {
                        quantidade = 0;
                        for (int j = 0; j < controleVoto; j++) {
                            if (governador[j] == i) {
                                quantidade++;
                            }
                        }
                        if (quantidade > maior) {
                            maior = quantidade;
                        }
                    }
                    for (int i = 401; i <= 403; i++) {
                        quantidade = 0;

                        for (int j = 0; j < controleVoto; j++) {
                            if (governador[j] == i) {
                                quantidade++;
                            }
                        }
                        if (quantidade == maior) {
                            if (i == 401) {
                                System.out.println("Patrick Cobra - " + quantidade + " voto(s)");
                            } else if (i == 402) {
                                System.out.println("Fernanda Souza - " + quantidade + " voto(s)");
                            } else {
                                System.out.println("Ricardo Oliveira - " + quantidade + " voto(s)");
                            }
                        }
                    }
                    System.out.println("\nVENCEDOR - PRESIDENTE:");
                    maior = 0;

                    for (int i = 501; i <= 503; i++) {
                        quantidade = 0;
                        for (int j = 0; j < controleVoto; j++) {
                            if (presidente[j] == i) {
                                quantidade++;
                            }
                        }
                        if (quantidade > maior) {
                            maior = quantidade;
                        }
                    }

                    for (int i = 501; i <= 503; i++) {
                        quantidade = 0;
                        for (int j = 0; j < controleVoto; j++) {
                            if (presidente[j] == i) {
                                quantidade++;
                            }
                        }
                        if (quantidade == maior) {
                            if (i == 501) {
                                System.out.println("Carl Johnson - " + quantidade + " voto(s)");
                            } else if (i == 502) {
                                System.out.println("Alessandro das Redes - " + quantidade + " voto(s)");
                            } else {
                                System.out.println("Lucas Ferreira - " + quantidade + " voto(s)");
                            }
                        }
                    }
                    break;



            }
            }
        }
    }


