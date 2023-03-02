package Data_Structures;


class Queue{

    private String [] names;
    private int size;
    private int front = 0, rear = -1;
    
    Queue(int size){
        this.size = size;
        names = new String[size];

    }

    public void enqueue(String name){
        
        if(rear == size-1) {
            rear = -1;
        }
      
        names[++rear] = name;
    }

    public String dequeue(){

        if(front == size){
            front = -1;
        }
       return names[++front];
    }
    

    public boolean isFull(){
        return size-1 == rear;
    }

    public boolean isEmpty(){
        return rear+1 == front;
    }

    public String peekFront(){

        return names[front];
    }

    public String peekRear(){
        return names[rear];
    }

    public void peekQueue(){

        if(isEmpty()){
            System.out.println("The Queue is Empty");

        }else
        {
            System.out.print("List Items are ->");

           for(int i = front; i <= rear; i++){

            System.out.print(" "+names[i]+ " ");
           }
    }
    }
}