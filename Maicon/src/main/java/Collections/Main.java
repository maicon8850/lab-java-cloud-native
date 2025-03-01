package Collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();  // List
        Set<Produto> produtosUnicos = new HashSet<>();    // Set
        Queue<Produto> filaProcessamento = new LinkedList<>(); // Queue
        Map<String, Produto> mapaProdutos = new HashMap<>(); // Map

        // Criando alguns produtos
        Produto p1 = new Produto("P001", "Notebook");
        Produto p2 = new Produto("P002", "Mouse");
        Produto p3 = new Produto("P003", "Teclado");

        // Adicionando aos diferentes tipos de Collection
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        produtosUnicos.add(p1);
        produtosUnicos.add(p2);
        produtosUnicos.add(p3);
        produtosUnicos.add(p1); // Set ignora duplicatas

        filaProcessamento.offer(p1);
        filaProcessamento.offer(p2);
        filaProcessamento.offer(p3);

        mapaProdutos.put(p1.getCodigo(), p1);
        mapaProdutos.put(p2.getCodigo(), p2);
        mapaProdutos.put(p3.getCodigo(), p3);

        // Exibição das coleções
        System.out.println("\nLista de Produtos (List - Permite Duplicatas):");
        listaProdutos.forEach(System.out::println);

        System.out.println("\nProdutos Únicos (Set - Sem Duplicatas):");
        produtosUnicos.forEach(System.out::println);

        System.out.println("\nFila de Processamento (Queue - Ordem de Entrada):");
        filaProcessamento.forEach(System.out::println);

        System.out.println("\nProdutos no Mapa (Map - Acesso por Código):");
        mapaProdutos.forEach((codigo, produto) -> System.out.println("Código: " + codigo + " -> " + produto));
    }
}
