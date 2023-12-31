package XI_Secretaria;

public class Secretaria_Escolar {

    //atributos
    private String nome_aluno;
    private int idade_aluno;
    private double media_aluno;
    private String curso_aluno;
    private String matricula_aluno;

    //metodo construtor
    public Secretaria_Escolar(){}

    //metodo construtor
    public Secretaria_Escolar (String nome_aluno, int idade_aluno, double media_aluno, String curso_aluno)
    {
        this.nome_aluno = nome_aluno;
        this.idade_aluno = idade_aluno;
        this.media_aluno = media_aluno;
        this.curso_aluno = curso_aluno;
    }

    //metodos get
    public String getNome_aluno(){
        return nome_aluno;
    }

    public int getIdade_aluno() {
        return idade_aluno;
    }

    public double getMedia_aluno() {
        return media_aluno;
    }

    public String getCurso_aluno() {
        return curso_aluno;
    }

    //metodos set()
    public void setMatricula_aluno(String matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }
    public String getMatricula_aluno() {
        return matricula_aluno;
    }
}
