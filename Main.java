public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert at beginning
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);

        // Insert at end
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(5);
        dll.insertAtEnd(50);

        // Display
        dll.displayForward();
        dll.displayBackward();

        // Delete first and last
        dll.deleteFirst();
        dll.deleteLast();
        dll.displayForward();

        // Delete by value
        dll.deleteByValue(20);
        dll.displayForward();

        // Delete before value
        dll.deleteBeforeValue(30);
        dll.displayForward();

        // Delete after value
        dll.deleteAfterValue(20);
        dll.displayForward();

        // Min and Max
        dll.findMin();
        dll.findMax();
    }
}
