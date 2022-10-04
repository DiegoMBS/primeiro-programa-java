package cursojava.classes;

import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasseJava {

    public static void main(String[] args){

        String qtdAluno = JOptionPane.showInputDialog("Informe quantos alunos deseja cadastrar:");

        List<Aluno> alunos  = new ArrayList<Aluno>();

        List<Aluno> alunosAprovados  = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados  = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao  = new ArrayList<Aluno>();

        //Validando quantos alunos serão cadastrados
        for (int qtd = 1; qtd <= Integer.valueOf(qtdAluno); qtd++) {


            String nome = JOptionPane.showInputDialog("Nome do aluno:");
        /*String idade = JOptionPane.showInputDialog("Idade do aluno:");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento do aluno:");
        String registroGeral = JOptionPane.showInputDialog("RG do aluno:");
        String numeroCpf = JOptionPane.showInputDialog("CPF do aluno:");
        String nomeMae = JOptionPane.showInputDialog("Nome da mãe do aluno:");
        String nomePai = JOptionPane.showInputDialog("Nome do Pai do aluno:");
        String dataMatricula = JOptionPane.showInputDialog("Data da Matricula do aluno:");
        String serieMatricula = JOptionPane.showInputDialog("Serie que o aluno esta matriculado:");
        String nomeEscola = JOptionPane.showInputDialog("Nome da escola:"); */

            Aluno aluno1 = new Aluno();

            aluno1.setNome(nome);
        /*aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatricula);
        aluno1.setNomeEscola(nomeEscola);*/

            //Quantidade de disciplinas e validando a remoção de alguma, lembrando que lista começa em 0
            for (int pos = 1; pos <= 1; pos++) {
                String nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomedisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }
            int escolha = JOptionPane.showConfirmDialog(null, "Gostaria de remover alguma disciplina ?");

            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {
                    String discipllinaRemover = JOptionPane.showInputDialog("Qual disciplina gostaria de remover: 1, 2, 3 ou 4?");
                    aluno1.getDisciplinas().remove(Integer.valueOf(discipllinaRemover) - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");

                }
            }

            alunos.add(aluno1);
        }
        //Lista de Aprovados / Reprovados ou Recuperação
        for(Aluno aluno : alunos) {

           if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
               alunosAprovados.add(aluno);

           }else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
                alunosRecuperacao.add(aluno);

           }else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
               alunosReprovados.add(aluno);

           }

        }
        //Processando as listas
        System.out.println("-----------------------Lista dos Aprovados---------------------");
        for (Aluno aluno : alunosAprovados){
        System.out.println("Resultado = " + aluno.getNome() + " , " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }
        System.out.println("-----------------------Lista dos Reprovados---------------------");
        for (Aluno aluno : alunosReprovados){
            System.out.println("Resultado = " + aluno.getNome() + " , "  + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }
        System.out.println("-----------------------Lista dos Recuperação---------------------");
        for (Aluno aluno : alunosRecuperacao){
            System.out.println("Resultado = " + aluno.getNome() + " , "  + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }
    }
}
