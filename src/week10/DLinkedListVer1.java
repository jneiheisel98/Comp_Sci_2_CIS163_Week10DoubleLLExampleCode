package week10;

public class DLinkedListVer1 {

        private DNode top;
        private DNode tail;

        public DLinkedListVer1() {
            top = null;
            tail = null;
        }

        // Final exam question.
        public void delAtTop () {

        }

        // Final exam question.
        public void addfirst (String data) {
            // case 0;
            if (top == null) {
                top = tail = new DNode(data, null, null);
                return;
            }

            // The list must exist
            top = new DNode (data, top, null);
            top.getNext().setPrev(top);

        }

        // Final exam question.
        public void addToTail (String data) {
            if (top == null) {
                top = tail = new DNode(data, null, null);
                return;
            }

            // The list must exist
            tail = new DNode(data, null, tail);
            tail.getPrev().setNext(tail);
            return;

        }

        // Final exam questions.
        public String DeleteAtEnd () {

            return null;
        }

        // Good example of Lab exam question
        public void insertInOrder (String data) {
        }

        public void moveCurrentDown() {
        }

        public void display() {
            DNode temp = top;

            while (temp != null) {
                System.out.println (temp.getData());
                temp = temp.getNext();
            }
        }

        public int size() {

            int count = 0;
            DNode temp = top;
            while (temp != null) {
                count++;
                temp = temp.getNext();
            }
            return count;
        }


        public static void main (String[] args){
            DLinkedListVer1 list = new DLinkedListVer1();

            list.insertInOrder("pizza1");
            list.insertInOrder("pizza2");
            list.insertInOrder("pizza5");
            list.insertInOrder("pizza3");
            list.insertInOrder("pizza1");
            list.insertInOrder("pizza5");
            list.insertInOrder("pizza9");

            list.delAtTop();
            list.delAtTop();
            list.delAtTop();
            list.delAtTop();
            list.delAtTop();
            list.delAtTop();

            //list.addToEnd("pizza4");
            list.display();
        }
    }



