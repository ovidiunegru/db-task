package org.example;

import org.example.model.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(10);
        tree.insert(11);

        tree.printTree();
        System.out.println();
        System.out.println("Find maximum value: " + tree.findMaxValue());
        System.out.println("Calculate tree depth: " + tree.findTreeDepth());
    }
}