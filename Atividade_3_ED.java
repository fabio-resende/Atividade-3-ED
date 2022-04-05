import java.util.ArrayList;
import java.util.ArrayDeque;

public class Atividade3ED {
  public static void main(String[] args) {

    ArrayList < Integer > lista = new ArrayList < > (5);
    ArrayDeque < Integer > pilha = new ArrayDeque < > (5);
    ArrayDeque < Integer > fila = new ArrayDeque < > (10);

    // Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
    for (int i = 1; i <= 5; i++) {
      lista.add(i);
    }

    System.out.println("Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células.\nLista " + lista + "\nPilha " + pilha + "\nFila " + fila);

    // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
    while (!lista.isEmpty()) {
      pilha.push(lista.remove(0));
    }

    System.out.println("\nPasso 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista.\nLista " + lista + "\nPilha " + pilha + "\nFila " + fila);

    // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células; 
    while (!pilha.isEmpty()) {
      fila.add(pilha.pop());
    }

    System.out.println("\nPasso 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células.\nLista " + lista + "\nPilha " + pilha + "\nFila " + fila);

    // Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
    for (int i = 6; i <= 10; i++) {
      lista.add(i);
    }

    System.out.println("\nPasso 4: Insira os números [6, 7, 8, 9 e 10] na lista.\nLista " + lista + "\nPilha " + pilha + "\nFila " + fila);

    // Passo 5: Repita os passos 2 e 3.
    // Passo 5.2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
    while (!lista.isEmpty()) {
      pilha.push(lista.remove(0));
    }

    System.out.println("\nPasso 5.2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista.\nLista " + lista + "\nPilha " + pilha + "\nFila " + fila);

    // Passo 5.3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células;
    while (!pilha.isEmpty()) {
      fila.add(pilha.pop());
    }

    System.out.println("\nPasso 5.3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células.\nLista " + lista + "\nPilha " + pilha + "\nFila " + fila);

    // Passo 6: Exiba todos os números que foram inseridos na fila. 
    System.out.println("\nPasso 6: Exiba todos os números que foram inseridos na fila.\nFila final:");
    System.out.println(fila);

  }
}