package XIII_informa_faculdades;

public class Sistemas_Informacao extends Fatec {
    Fatec curso1 = new Fatec();

    public Sistemas_Informacao ()
    {
        curso1.mostracurso();

        curso1.setNomecurso("Tecnologia em Sistemas de Informação");
        curso1.setQuantidadealunos(160);

        curso1.atualizaalunos(20);
        curso1.mostracurso();

        mostracurso();
    }

    public void mostracurso()
    {
        curso1.setNomecurso("Bacharel em Sistemas de Informação");
        curso1.setQuantidadealunos(40);
        System.out.println("nome do curso: " + curso1.getNomecurso() +
               "\n" + "quantidade de alunos: " + curso1.getQuantidadealunos() );
    }
}
