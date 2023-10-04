package XI_Secretaria;

/** EXERCICIO:
 * 6. Fazer uma atribuição de matrícula, na classe “Matricula”
 */
public class Matricula extends Quarto_Ciclo_SI{
    public static void main(String args[]){

        //objeto do tipo Quarto_Ciclo
        Quarto_Ciclo_SI E = new Quarto_Ciclo_SI();
        E.setMatricula_aluno("RA122000");
        System.out.println("Matricula: \t" + E.getMatricula_aluno());
    }
}
