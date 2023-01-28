public class Main {
    public static void main(String[] args) {

        Employee safirarizqa = new Employee("Safira", "Rizqa", 1);
        Employee intaninta = new Employee("Intan", "Inta", 2);
        Employee megameg = new Employee("Mega", "Meg", 3);
        Employee diannurdiani = new Employee("Dian", "Nurdiani", 4);
        Employee sifasif = new Employee("Sifa", "Sif", 5);

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(safirarizqa);
        queue.enqueue(intaninta);
        queue.enqueue(megameg);
        queue.enqueue(diannurdiani);
        queue.enqueue(sifasif);

        System.out.println("\n");
        System.out.println("Show All");
        queue.printQueue();

        System.out.println("\n");
        System.out.println("After Deletion Queue");
        queue.dequeue();
        queue.printQueue();

        System.out.println("\n");
        System.out.println("Insert Rear Queue :");
        queue.printQueue();
        System.out.println(queue.peekRear());
        System.out.println("\n");
    }
}