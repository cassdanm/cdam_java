package XI_Secretaria;

public class Quarto_Ciclo_SI extends Secretaria_Escolar {

    public static void main (String args[]){

        //objeto do tipo Secretaria_Escolar
        Secretaria_Escolar A = new Secretaria_Escolar();
        Insere_Dados(A);

        //obejto do tipo Secretaria_Escolar
        Secretaria_Escolar B = new Secretaria_Escolar("Maria",
                22, 7.7, "Sistemas p Internet");
        Insere_Dados(B);
    }

    public static void Insere_Dados(Secretaria_Escolar C){
        System.out.println("Nome do aluno: \t" + C.getNome_aluno());
        System.out.println("Idade do aluno: \t" + C.getIdade_aluno());
        System.out.println("Media do aluno: \t" + C.getMedia_aluno());
        System.out.println("Curso do aluno: \t" + C.getCurso_aluno());
    }
}
