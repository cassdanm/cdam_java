package X_Fatec;


public class Faculdade_CEETEPs extends Centro_Paula_Souza {
    private String faculdade;

    public Faculdade_CEETEPs(){

        super("Santos"); //acessa métodos da classe imediatamente superior
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {

        this.faculdade = faculdade;
    }
}
