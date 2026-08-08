public class LinkedListOperations {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // 1. Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 3. Insert at a specific position
    // Position starts from 1
    void insertAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete from beginning
    void deleteFromBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // 5. Delete from end
    void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // 6. Delete from specific position
    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // 7. Delete a node by value
    void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If first node contains value
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
    }

    // 8. Search an element
    boolean search(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == value) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // 9. Display linked list
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // 10. Count nodes
    int countNodes() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // 11. Reverse linked list
    void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    // 12. Find middle element
    void findMiddle() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }

    // Main method
    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        // Insert
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original List:");
        list.display();

        // Insert at beginning
        list.insertAtBeginning(5);

        System.out.println("After inserting at beginning:");
        list.display();

        // Insert at position
        list.insertAtPosition(15, 3);

        System.out.println("After inserting 15 at position 3:");
        list.display();

        // Delete from beginning
        list.deleteFromBeginning();

        System.out.println("After deleting from beginning:");
        list.display();

        // Delete from end
        list.deleteFromEnd();

        System.out.println("After deleting from end:");
        list.display();

        // Delete by position
        list.deleteAtPosition(2);

        System.out.println("After deleting position 2:");
        list.display();

        // Insert again
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("After adding 40 and 50:");
        list.display();

        // Search
        int value = 40;

        if (list.search(value)) {
            System.out.println(value + " found");
        } else {
            System.out.println(value + " not found");
        }

        // Count
        System.out.println("Number of nodes: " + list.countNodes());

        // Middle
        list.findMiddle();

        // Reverse
        list.reverse();

        System.out.println("After reversing:");
        list.display();

        // Delete by value
        list.deleteByValue(30);

        System.out.println("After deleting value 30:");
        list.display();
    }
}