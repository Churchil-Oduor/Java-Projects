

public class DelimiterMatching{


    private String input;
    private int length;
    private String check ="";
    private  Dstack stc ;
    

        DelimiterMatching(String input){
            this.length = input.length();    
            stc = new Dstack(length);
            String symbol;
            int counter = 0;
            //push symbols into the stack

            for(int i = 0; i < length ; i++) {
                
                symbol = input.substring(i, i+1);

                if(symbol.equalsIgnoreCase("}") || symbol.equalsIgnoreCase("{") 
                || symbol.equalsIgnoreCase("[") || symbol.equalsIgnoreCase("]")
                || symbol.equalsIgnoreCase("(") || symbol.equalsIgnoreCase(")")) 
                {
                    stc.push(symbol);
                    counter++;
                }
            }


            Dstack hold = new Dstack(counter);
            //check if the input is empty
            loop:
            while(!stc.isEmpty()){
               
                String stc_symbol = stc.pop();
               
                switch(stc_symbol){
                case "}" :
                case "]" :
                case ")" :
                    hold.push(stc_symbol);
                    break;
                
                case "{":
                case "[":
                case "(":
                 

                    if(stc_symbol != null) {
                     

                        if(reverseMatch(stc_symbol).equalsIgnoreCase(hold.pop())){
                           
                            this.check = "Correct";
                           
                        }
                        else
                        {
                            this.check = "Wrong";
                            break loop;

                        }
                    }
                    break;
                default:
                    break;
                }
            }
        }

        private String enSymbol;
        public String reverseMatch(String symbol){
            this.enSymbol = symbol;
           
            switch(enSymbol){
                case "{" :
                    enSymbol = "}";
                    break;
                case "[" :
                    enSymbol = "]";
                    break;
                case "(" :
                    enSymbol =")";
                    break;

                default:
                    enSymbol= " ";

            }

            return enSymbol;
        }


        public String isCorrect(){
            return this.check;
        }

}



class Dstack{

    private String symbol;
    private int top = -1;
    private int size;
    private String [] stc;

    
    Dstack(int size){
        this.size =size;
        stc = new String[size];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(String symbol){
        stc[++top] = symbol;
    }

    public String pop(){
        return stc[top--];
    }

    public int size(){
        return top+1;
    }


}