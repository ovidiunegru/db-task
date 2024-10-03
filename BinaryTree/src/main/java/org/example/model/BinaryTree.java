package org.example.model;

import org.example.model.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
     public Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    public int findMaxValue() {
        if (root == null) {
            throw new IllegalStateException("Tree's empty");
        }

        return findMaxValue(root);
    }

    private int findMaxValue(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMaxValue(node.left);
        int rightMax = findMaxValue(node.right);

        return Math.max(node.value, Math.max(leftMax, rightMax));
    }

    public int findTreeDepth() {
        return calculateDepth(root);
    }

    private int calculateDepth(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public void printTree() {
        printNode(root);
    }

    private void printNode(Node root) {
        if (root != null) {
            printNode(root.left);
            System.out.print(root.value + " ");
            printNode(root.right);
        }
    }

}