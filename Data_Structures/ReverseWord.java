package Data_Structures;

public class ReverseWord {

    private String word, output = "";
    private int length;
    My_Stack stx;

    ReverseWord(String word){
        
        this.word = word;
        this.length = word.length();
        stx = new My_Stack(length);
        
        for(int i = 0; i < length; i++){ 
            stx.push(word.charAt(i));
        }
        
    }

    public String Reverse(){
        
        while(!stx.isEmpty()){

            output += stx.pop();
        }

        return output;
    }
    
}

class My_Stack {

    private int size;
    private int top = -1;

    private char[] ch ;

    My_Stack(int size){
        this.size = size;
        ch = new char[size];
    }

    public void push(char character){
        
        ch[++top] = character;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public char pop(){
        return ch[top--];
    }

}
