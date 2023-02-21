package Data_Structures;


class Stack{

    private int top= -1; // no item in the stack.
    private double []array;
    private int size; //size of the stack
    
    Stack(int size){
        this.size = size;
        array = new double[size];
        
    }


    public boolean isEmpty() {

        return (top == -1);

    }

    public void push(double item) {

        array[++top] = item;

    }

    public double pop(){
        
        return array[top--];
    }

    public int size() {
        return size;
    }

    public double peek(){
        return array[top];
    }

}