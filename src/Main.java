import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1941894153", "Joao", "joao@gmail.com", "Rua Ferreira, 123");
        Livro livro1 = new Livro("2141241", "Programacao", "Jackob", 10, 20);
        Pedido pedido1 = cliente1.fazPedido(livro1, 2);

    }
}