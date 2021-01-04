package demo.dateStructs;

public class demo {


    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        LinkedList head = new LinkedList(node0);
        head.show();


    }


    static  class  LinkedList{

        private  Node head;

        public LinkedList(Node head) {
            this.head = head;
        }


        public  void  show(){
            head.show();
        }
    }



   static class Node{

        private  int  id;
        private  Node next;

        public Node() {
        }

        public Node(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public  void   show(){
            System.out.println(this.id);
            if(this.next!=null){
                this.next.show();
            }
        }


    }
}
