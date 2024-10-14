package br.com.mangarosa;

import java.util.Arrays;

import br.com.mangarosa.datastructures.interfaces.impl.LinkedQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    LinkedQueue<Integer> queue = new LinkedQueue<>();

    queue.enqueue(9);
    queue.enqueue(9);
    queue.enqueue(9);
    System.out.println(queue.toArray());
    System.out.println(Arrays.toString(queue.toArray()));

    }
}