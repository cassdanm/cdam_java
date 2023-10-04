package X_Fatec;

/** EXERCICIOS
 2 Adicionar à aplicação uma classe chamada “Disciplinas_CEETEPs”, com
 extensão para Faculdade_CEETEPs, com o atributo “nome_disciplina” do tipo string.

 3 Prover as informações sobre o novo atributo através da classe “Acessa_Faculdade”.

 4 -ustificar as repetições da execução do método construtor das superclasses:????
 */
public class Disciplinas_CEETEPs extends Faculdade_CEETEPs {

    private String nome_disciplina;

    public String getDisciplina() {

        return nome_disciplina;
    }

    public void setDisciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
}
