public class Main {
    public static void main(String[] args) {
        Minion minion1 = new Minion("minion1", 1);
        Minion minion2 = new Minion("minion2", 2);
        Minion minion3 = new Minion("minion3", 3);
        Minion minion4 = new Minion("minion4", 4);
        DoublyLinkedList<Minion> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst(minion1);
        doublyLinkedList.addLast(minion2);
        doublyLinkedList.addFirst(minion4);
        doublyLinkedList.addLast(minion3);
        doublyLinkedList.show();
        doublyLinkedList.printSize();
        doublyLinkedList.removeByName("minion1");
        doublyLinkedList.show();
        doublyLinkedList.removeByName("minion6");
        doublyLinkedList.changeAgeByName("minion2", 5);
        doublyLinkedList.show();
        doublyLinkedList.changeAgeByName("minion", 1);
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        doublyLinkedList.show();
        doublyLinkedList.clear();
        doublyLinkedList.show();
        doublyLinkedList.printSize();}}

