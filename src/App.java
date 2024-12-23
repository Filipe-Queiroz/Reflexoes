/**
 * @author Filipe Queiroz
 */

public class App {
    public static void main(String[] args) {
        executeLeituraAnotacao();
    }

    private static void executeLeituraAnotacao() {
        Usuario user = new Usuario();

        if (user.getClass().isAnnotationPresent(ITabela.class)) {
            ITabela anotacao = user.getClass().getAnnotation(ITabela.class);
            System.out.println("Nome da anotação: " + anotacao.getClass().getName());
            System.out.println("Valor da anotação: " + anotacao.value());
        }
    }
}