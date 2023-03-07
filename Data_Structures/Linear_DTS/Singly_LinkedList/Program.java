
class Program {
    public static void main (String args[]){

        LinkedList list = new LinkedList();
        list.add("Churchil");
        list.add("Allan");
        list.add("Stanley");
        list.add("Benard");

        list.peekListData();

        System.out.println("====================");
        list.remove("Allan");
        list.peekListData();
        
    }
}
