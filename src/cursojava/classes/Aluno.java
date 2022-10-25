package cursojava.classes;


import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//utilizando herança
public class Aluno extends Pessoa{

    /*Esta é a nossa classe/objeto que representa o Aluno*/
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }
    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome) && Objects.equals(dataNascimento, aluno.dataNascimento) && Objects.equals(registroGeral, aluno.registroGeral) && Objects.equals(numeroCpf, aluno.numeroCpf) && Objects.equals(nomeMae, aluno.nomeMae) && Objects.equals(nomePai, aluno.nomePai) && Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(nomeEscola, aluno.nomeEscola) && Objects.equals(serieMatriculado, aluno.serieMatriculado) && Objects.equals(disciplinas, aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai, dataMatricula, nomeEscola, serieMatriculado, disciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    /*Metodo que retorna a media do aluno*/
    public double getMediaNota(){
        double somaNotas = 0.0;
        for (Disciplina disciplina:disciplinas) {
            somaNotas += disciplina.getNota();

        }
        return  somaNotas / disciplinas.size();
    }

    /*Metodo que retorna true para aprovado e false para reprovado*/
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70){

           return true;

        }else{

            return false;
        }

    }

    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 50 ){
            if (media >= 70) {
                return StatusAluno.APROVADO;
            }else{
                return StatusAluno.RECUPERACAO;
            }
        }else {
            return  StatusAluno.REPROVADO;
        }

    }

    @Override // identifica metodo sobrescrito - ja existente que esta utilizando novamente.
    public boolean idadeMaior() {

        return idade >= 21;
    }
    public String mmsgMaiorIdade(){
        return this.idadeMaior() ? "Voce é maior de idade" : "Voce é menor de idade";
    }
}
