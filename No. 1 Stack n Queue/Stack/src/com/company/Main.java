package com.company;

public class Main {

    public static void main(String[] args) {


        Employee vira = new Employee("vira","martalegawa", 1);
        Employee ntan = new Employee("ntan","intan", 2);
        Employee meg = new Employee("meg", "mega", 3);
        Employee dian = new Employee("dian", "yan", 4);
        Employee sif = new Employee("sif", "sifa", 5);

        LinkedStack stack = new LinkedStack();

        stack.push(vira);
        stack.push(ntan);
        stack.push(meg);
        stack.push(dian);
        stack.push(sif);

        System.out.println("============show all");
        stack.printStack();
        System.out.println("\n");
        System.out.println("============Insert");
        System.out.println(stack.peek());

        stack.pop();
        System.out.println("\n");
        System.out.println("=============After Deletion");
        stack.printStack();

        //System.out.println(stack.peek());

    }
}
