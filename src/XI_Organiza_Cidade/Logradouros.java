package XI_Organiza_Cidade;

/** EXERCICIOS
 * 2. Adicionar à aplicação uma classe chamada “Logradouros”, com extensão para Região_de_Santos,
 * com os atributos “tipo_logradouro” e “local_logradouro”, ambos do tipo string.

 * 3. Inserir na superclasse, no método construtor, uma mensagem impressa como foi feito para
 * região e bairro. Acessar o método construtor da superclasse através do método super( ).

 * 4. Verificar que atributos e métodos a nova classe “Logradouros” tem acesso.
 */
public class Logradouros extends Regiao_de_Santos{

    //atributos
    private String tipo_logradouro;
    private String local_logradouro;

    Logradouros(){
        super("l");
    }

}
