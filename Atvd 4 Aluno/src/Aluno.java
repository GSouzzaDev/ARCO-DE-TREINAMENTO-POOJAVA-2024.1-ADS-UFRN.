public class Aluno{

//Atributos
    private String nome;
    private Integer matricula;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float media;
    private String situacao;

//Metodos Especiais:
    public Aluno(){
        this.media = 0f;
        this.situacao = "Indefinida";
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }

    public Integer getMatricula(){
        return matricula;
    }

    public void setNotas( Float n1, Float n2, Float n3){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public Float getNota1(){
        return nota1;
    }

    public Float getNota2(){
        return nota2;
    }

    public Float getNota3(){
        return nota3;
    }

    public void setMedia(Float media){
        this.media = media;
    }

    public Float getMedia(){
        return media;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }

    public String getSituacao(){
        return situacao;
    }

    //Metodos Abstratos:

    public void calcularMedia(){
        this.media = (nota1+nota2+nota3)/3;
        if (media < 3) {
            this.situacao="Reprovado";
        } else if (media >= 7) {
            this.situacao="Aprovado";
        } else{
            this.situacao="Reprovado";
        }
    }

    public void dadosAlunos(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);
    }

    public void alterarNota(Integer codNota, Float novaNota){
        if (codNota==1){
            this.nota1 = novaNota;
        } else if(codNota==2){
            this.nota2 = novaNota;
        }else{
            this.nota3 = novaNota;
        }
        System.out.println("Nota alterada");
    }
}