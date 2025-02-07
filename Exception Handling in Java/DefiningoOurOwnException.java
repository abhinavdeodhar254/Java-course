class LowBalanceException extends Exception{
    
    public String toString(){
         return "The balance is less than 5000";

    }
}

class withdraw{ //this is the sample class we need to call our exception.

    public static void functiondemo(){
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.err.println("Mimimum balance is less "+ e);
        }

    }

}


public class DefiningoOurOwnException {
    public static void main(String[] args) {
        withdraw fun1=new withdraw();
        fun1.functiondemo(); //here we are calling the method and we purpously are using "throw" keyword to throw that exception.
    }
    
}
