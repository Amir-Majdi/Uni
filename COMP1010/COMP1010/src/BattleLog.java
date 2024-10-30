import java.io.FileWriter;
import java.io.IOException;

class BattleLog {
    //start of the linked list
    private Node head;  

    //inner node class representing each entry in the log
    private class Node {
        String move;
        Node next;

        Node(String move) {
            this.move = move;
            this.next = null;
        }
    }

    //method to add a move to the log
    public void addMove(String move) {
        head = addMoveRecursive(head, move);
    }

    //recursive helper method to add a move at the end of the linked list
    private Node addMoveRecursive(Node current, String move) {
        if (current == null) {
            
            //create a new node if we've reached the end of the list
            return new Node(move);  
        }
        current.next = addMoveRecursive(current.next, move);  
        return current;  
    }

    //method to save the log to a file
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            saveToFileRecursive(head, writer);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the battle log: " + e.getMessage());
        }
    }

    //recursive helper method to write each node's move to the file
    private void saveToFileRecursive(Node current, FileWriter writer) throws IOException {
        if (current == null) {
            return;  //base case: end of list
        }
        writer.write(current.move + "\n");  //wite current move
        saveToFileRecursive(current.next, writer);  //recur to write the next node
    }

    //print the log for debugging
    public void printLog() {
        printLogRecursive(head);
    }

    //recursive helper method to print each move in the log
    private void printLogRecursive(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.move);
        printLogRecursive(current.next);
    }
}

