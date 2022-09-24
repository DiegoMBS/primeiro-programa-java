package cursojava.classes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasseJava {

    public static void main(String[] args){

        String qtdAluno = JOptionPane.showInputDialog("Informe quantos alunos deseja cadastrar:");
        List<Aluno> alunos  = new ArrayList<Aluno>();

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

        for(Aluno aluno : alunos) {

            /*Procurando um aluno na lista*/
            if (aluno.getNome().equalsIgnoreCase("Alex")) {

                alunos.remove(aluno);
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("O aluno removido da lista: " + aluno.getNome());
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                break;

            }else{

                /*Descrevendo objeto na memoria */
                System.out.println(aluno);
                System.out.println("Média do aluno:  = " + aluno.getMediaNota());
                System.out.println("Resultado: " + aluno.getAlunoAprovado2());
                System.out.println("Disciplinas: " + aluno.getDisciplinas());
                System.out.println("-------------------------------------------------------------------------------------");
            }
        }
        //Percorrendo uma lista pelas posições
        for (int pos = 0; pos < alunos.size(); pos ++){

                Aluno aluno = alunos.get(pos);

                //Substituindo um aluno na lista
                if (aluno.getNome().equalsIgnoreCase("Diego")){

                    Aluno trocar = new Aluno();
                    trocar.setNome("Aluno " + aluno.getNome() + " foi trocado por Timótio");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina("Matematica");
                    disciplina.setNota(96);

                    trocar.getDisciplinas().add(disciplina);

                    alunos.set(pos, trocar);
                    aluno = alunos.get(pos);

                }
                System.out.println("Aluno(s) = " + aluno.getNome());
                System.out.println("Média do aluno = " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------------------");

            for (Disciplina disc : aluno.getDisciplinas()) {
                    System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());

            }
        }
    }
}
