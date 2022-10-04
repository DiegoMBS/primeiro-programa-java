package cursojava.classes;

import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PrimeiraClasseJava {

    @SuppressWarnings("rawTypes")
    public static void main(String[] args){

        String login = JOptionPane.showInputDialog("Informe o login");
        String senha = JOptionPane.showInputDialog("Informe suan senha");

        if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin"));     String qtdAluno = JOptionPane.showInputDialog("Informe quantos alunos deseja cadastrar:");
        {

            List<Aluno> alunos = new ArrayList<Aluno>();

            //Lista com uma chave que identifica uma sequencia de valores
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


            //Validando quantos alunos serão cadastrados
            for (int qtd = 1; qtd <= Integer.valueOf(qtdAluno); qtd++) {


                String nome = JOptionPane.showInputDialog("Nome do aluno:");
                Aluno aluno1 = new Aluno();

                aluno1.setNome(nome);

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

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

            //Lista de Aprovados / Reprovados ou Recuperação
            for (Aluno aluno : alunos) {

                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);

                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                    ;

                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);

                }

            }
            //Processando as listas
            System.out.println("-----------------------Lista dos Aprovados---------------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado = " + aluno.getNome() + " , " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
            }
            System.out.println("-----------------------Lista dos Reprovados---------------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado = " + aluno.getNome() + " , " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
            }
            System.out.println("-----------------------Lista dos Recuperação---------------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado = " + aluno.getNome() + " , " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
            }

        }


    }
}
