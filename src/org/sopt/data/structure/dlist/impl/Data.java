package org.sopt.data.structure.dlist.impl;

import org.sopt.data.structure.dlist.base.Node;

import java.util.Random;

public class Data extends Node {


    private static final int ID_LIMITATION = 50;
    private static Random random = new Random();

    public int id;

    public String title;
    public String content;

    public Data() { this.id = 0; }
    public Data(String title, String content) {

        this.id = random.nextInt(ID_LIMITATION) + 1;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() { return "ID : " + id + " | Title : " + title + " | Content : " + content; }
}
