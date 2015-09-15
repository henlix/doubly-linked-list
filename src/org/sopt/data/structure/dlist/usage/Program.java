package org.sopt.data.structure.dlist.usage;


import org.sopt.data.structure.dlist.impl.Data;
import org.sopt.data.structure.dlist.model.DoublyLinkedList;

import java.util.ArrayList;

public class Program {

    private static ArrayList<Data> sample;

    static {


        sample = new ArrayList<>();

        sample.add(new Data("Lorem ipsum dolor sit amet", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        sample.add(new Data("In eget lacus rhoncus", "In eget lacus rhoncus, facilisis justo ac, venenatis turpis."));
        sample.add(new Data("Vestibulum aliquet", "Vestibulum aliquet leo sed tellus faucibus, quis feugiat felis lobortis."));
        sample.add(new Data("Nunc ut augue sit", "Nunc ut augue sit amet leo consectetur volutpat."));
        sample.add(new Data("Praesent fermentum", "Praesent fermentum ex quis nunc porta, sit amet ultricies justo ultricies."));
        sample.add(new Data("Morbi vehicula justo", "Morbi vehicula justo aliquam velit lacinia tristique."));
        sample.add(new Data("Suspendisse varius", "Suspendisse varius orci ullamcorper, porta tellus sed, dignissim diam."));
        sample.add(new Data("Nunc fermentum arcu", "Nunc fermentum arcu viverra, porta nibh eget, luctus quam."));
        sample.add(new Data("Nam finibus felis non", "Nam finibus felis non magna scelerisque, eget fringilla nulla scelerisque."));
        sample.add(new Data("Donec sagittis eros", "Donec sagittis eros quis dui auctor porta."));
    }

    public static void main(String[] args) {

        for (Data data : sample)
            System.out.println(data);

        System.out.println("=========================================");

        DoublyLinkedList<Data> list = new DoublyLinkedList<>(Data.class);

        list.add(sample.get(0));
        list.add(sample.get(5));
        list.add(sample.get(3));

        for (int i = 0; i < list.size(); i++) {

            Data data = list.get(i);
            System.out.println(data);
        }

        System.out.println("=========================================");

        list.remove(sample.get(5));

        for (int i = 0; i < list.size(); i++) {

            Data data = list.get(i);
            System.out.println(data);
        }

        System.out.println("=========================================");
    }
}
