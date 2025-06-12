package org.example;

public class TesteLL {
    public static void main(String[] args) {
        // Criando uma lista ligada com valor inicial 10
        LinkedListsExamples lista = new LinkedListsExamples(10);

        // Adicionando elementos ao final
        lista.append(20);
        lista.append(30);

        // Adicionando elementos ao início
        lista.prepend(5);

        // Inserindo elemento no índice 2
        lista.insert(2, 15);

        // Removendo o primeiro elemento
        lista.removeFirst();

        // Removendo o último elemento
        lista.removeLast();

        // Alterando o valor do índice 1
        lista.set(1, 99);

        // Imprimindo todos os elementos e estado da lista
        lista.printAll();

        // Invertendo a lista
        lista.reverse();

        // Imprimindo novamente após inverter
        System.out.println("\nLista invertida:");
        lista.printAll();
    }
}
