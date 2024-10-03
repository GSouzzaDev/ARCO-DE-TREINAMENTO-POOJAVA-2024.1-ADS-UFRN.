import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opc;
        do{
            System.out.println("-----------");
            System.err.println("Menu");
            System.out.println("-----------");
            System.out.println("1-Cadastrar Alunos");
            System.out.println("2-Cadastrar Notas");
            System.out.println("3-Calcular medias");
            System.out.println("4-Informar Siutacoes");
            System.out.println("5-informar dados de um aluno");
            System.out.println("6-alterar nota");
            System.out.println("7-Sair");
            System.out.println("-----------");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite sua matricula: ");
                    Integer matricula = scanner.nextInt();
            
                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome(nome);
                    novoAluno.setMatricula(matricula);
                    alunos.add(novoAluno);
                    break;
                case 2:
                    for (Aluno aluno : alunos){
                        System.out.println("Digites notas do aluno: " + aluno.getNome());
                        System.out.println("Digite a nota 1 do aluno: ");
                        Float nota1 = scanner.nextFloat();
                        System.out.println("Digite a nota 2 do aluno: ");
                        Float nota2 = scanner.nextFloat();
                        System.out.println("Digite a nota 3 do aluno: ");
                        Float nota3 = scanner.nextFloat();
                        aluno.setNotas(nota1, nota2, nota3);

                        System.out.println("Notas cadastradas");
                    }
                    break;
                case 3:
                    for (Aluno aluno : alunos){
                        aluno.calcularMedia();
                        System.out.println("Aluno: " + aluno.getNome());
                        System.out.println("Sua media:" + aluno.getMedia());
                    }
                    break;
                case 4:
                    for (Aluno aluno : alunos){
                        System.out.println("Aluno: " + aluno.getNome());
                        System.out.println("Sua situacao: " + aluno.getSituacao());
                    }
                    break;
                case 5:
                    System.out.println("Digite a matricula desejada: ");
                    Integer mat = scanner.nextInt();
                    for (Aluno aluno : alunos){
                        if (aluno.getMatricula().equals(mat)) {
                            aluno.dadosAlunos();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Digite a matricula desejada: ");
                    mat = scanner.nextInt();

                    System.out.println("Digite a nota a alterar(Ex.1, 2...): ");
                    Integer codNota = scanner.nextInt();

                    System.out.println("Digite o valor a alterar: ");
                    Float novaNota = scanner.nextFloat();

                    for (Aluno aluno : alunos){
                        if (aluno.getMatricula().equals(mat)) {
                           aluno.alterarNota(codNota, novaNota);
                        }
                    }

                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.err.println("Opcao invalida!");
                    break;
            }
        }while(opc !=7);
        scanner.close();
    }
}
