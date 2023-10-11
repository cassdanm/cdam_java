package XIII_informa_faculdades;

public class Fatec {

    private String nomecurso;
    private int quantidadealunos;

    public Fatec (){
        nomecurso = "";
        quantidadealunos = 0;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public int getQuantidadealunos() {
        return quantidadealunos;
    }

    public void setQuantidadealunos(int quantidadealunos) {
        this.quantidadealunos = quantidadealunos;
    }

    public void mostracurso()
    {
        System.out.println("nome do curso: " + nomecurso + "\n" +
                "quantidade de alunos: " + quantidadealunos +);
    }

    public void atualizaalunos(int matriculas)
    {
        quantidadealunos = quantidadealunos + matriculas;
    }
}
