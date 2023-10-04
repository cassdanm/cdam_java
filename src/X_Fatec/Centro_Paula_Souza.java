package X_Fatec;

public class Centro_Paula_Souza {
    private String Fatec;
    private String cidade;

    public Centro_Paula_Souza(String cidade){
        this.cidade = cidade;
        System.out.println("metodo construtor da superclass \n" + "cidade: " + cidade);
    }

    public void setFatec(String fatec) {
        this.Fatec = fatec;
    }

    public String getFatec() {
        return Fatec;
    }
}
