package org.sopt.data.structure.dlist.base;

public class Node<T> {

    private Node left;
    private Node right;

    public Node left() { return left; }
    public void left(Node node) { this.left = node; }

    public Node right() { return right; }
    public void right(Node node) { this.right = node; }
}
