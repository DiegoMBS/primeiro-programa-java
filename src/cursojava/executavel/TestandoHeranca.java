package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoHeranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Diego Marques");
        aluno.setNumeroCpf("98765643121");
        aluno.setIdade(18);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("12345689711");
        diretor.setNome("Barreto");
        diretor.setIdade(57);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setIdade(32);


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


        System.out.println(aluno.idadeMaior() + " - " + aluno.mmsgMaiorIdade());
        System.out.println(diretor.idadeMaior() + " - " + aluno.mmsgMaiorIdade());
        System.out.println(secretario.idadeMaior() + " - " + aluno.mmsgMaiorIdade());

    }
}
