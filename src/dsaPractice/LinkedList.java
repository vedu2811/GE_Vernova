package dsaPractice;

public class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = null;
    }
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head =newNode;
        System.out.println("Inserted " + data + " at head.");
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " at head (list was empty).");
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        System.out.println("Inserted " + data + " at tail.");
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        int deletedData = head.data;
        head = head.next; // Move head to the next node
        System.out.println("Deleted " + deletedData + " from head.");
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.next == null) {
            int deletedData = head.data;
            head = null;
            System.out.println("Deleted " + deletedData + " from tail (list is now empty).");
            return;
        }

        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        int deletedData = current.data;
        prev.next = null; // Cut the link to the last node
        System.out.println("Deleted " + deletedData + " from tail.");
    }

    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("List: [Empty]");
            return;
        }

        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtTail(10);
        list.insertAtHead(5);
        list.insertAtTail(20);

        list.printList();

        list.deleteAtHead();
        list.printList();

        list.deleteAtTail();
        list.printList();

        list.deleteAtTail();
        list.printList();

        list.deleteAtHead();
    }
}
