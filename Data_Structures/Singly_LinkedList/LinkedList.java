
 public class LinkedList{

     /*
     * Instatiating the head node through a constructor
     */
    private Node head;
    
     LinkedList(){
        head = new Node("Head Node");
     }


    private class Node{

        private Node next ;
        private String nodeName;

       public Node(String nodeName){
        next =null;
        this.nodeName = nodeName;

       }

       public Node getNext(){
            return next;
       }

       public String getNodeName(){
        return nodeName;
       }

       public void setNext(Node next){
        this.next = next;
       }

    }


   
     /*
      * Method to add a new Node
      */
     
      public void add(String nodeName){
        
        Node newNode = new Node(nodeName);
        Node currentNode = head;

        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext(); 
        }

        currentNode.setNext(newNode);
      }


      public void remove(String data) {

                Node current = head;

            if(current.getNext() != null) {
                do{
                    if(current.getNext().getNodeName().equalsIgnoreCase(data)) {

                        current.setNext(current.getNext().getNext());
                        break;
                    }
                    else{

                        current = current.getNext();
                    }
                    
                }
                while(current.getNext() != null);
            }
      }

      public void peekListData(){
        Node headNode = head;

        if(headNode.getNext() != null) {
            do{
                headNode = headNode.getNext();
                System.out.println(headNode.getNodeName());
            }
            while( headNode.getNext() != null );
        }

        else{
            System.out.println("Error -> You have not created any node");

        }
      }
  

}


