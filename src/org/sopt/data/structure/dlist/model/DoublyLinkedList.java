package org.sopt.data.structure.dlist.model;

import org.sopt.data.structure.dlist.base.Node;

public class DoublyLinkedList<T extends Node> {

    private T header;

    private int size;
    public int size() { return size; }

    public DoublyLinkedList(Class<T> c) {

        try {

            header = c.newInstance();
        }
        catch (InstantiationException | IllegalAccessException e) { e.printStackTrace(); }
    }

    public void add(T t) {

        Node pointer = header;

        while (pointer.right() != null)
            pointer = pointer.right();

        pointer.right(t);
        t.left(pointer);

        size++;
    }

    public void remove(T t) {

        Node pointer = header;

        while (pointer != null) {

            pointer = pointer.right();

            if (t.equals(pointer))
                break;
        }

        if (pointer == null)
            return;

        if (pointer.right() == null)  {

            pointer.left().right(null);
        }
        else {

            pointer.right().left(pointer.left());
            pointer.left().right(pointer.right());
        }

        size--;
    }

    public T get(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        int count = 0;
        Node pointer = header.right();

        while (count++ < index)
            pointer = pointer.right();

        return (T) pointer;
    }
}
