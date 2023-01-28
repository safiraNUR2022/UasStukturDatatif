package com.company;


public class Main {

    public static void main(String[] args) {
        com.company.Tree IntTree = new com.company.Tree();
        IntTree.insert(17);
        IntTree.insert(3);
        IntTree.insert(5);
        IntTree.insert(26);
        IntTree.insert(34);
        IntTree.insert(24);
        IntTree.insert(23);
        IntTree.insert(30);
        IntTree.insert(21);

        IntTree.traverseInOrder();
        System.out.println();

        System.out.println(IntTree.get(26));
        System.out.println(IntTree.get(34));

        System.out.println(IntTree.max());
        System.out.println(IntTree.min());
        System.out.println("\n\n");

    }

}
