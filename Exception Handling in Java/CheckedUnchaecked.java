class one{

    public int calculate(){
        int a=10;
        int b=0;
        int c;
        c=a/b;      //this will return an exception. 
                    //this is unchecked exception.
                    //compiler is not giving any error.
                    //exception goes to the method which has called this method. that is method 2
        return c;
    }

    public void method2(){
    calculate();     //here we are calling the same method but the 
                    //exception is not handled here as well.
                     //exception goes to the method which has called this method. that is method 3
    }

    public void method3(){
    calculate();  //here we are calling the same method but the 
                  //exception is not handled here as well.
                   //exception goes to the method which has called this method. that is main method.
    }
}



public class CheckedUnchaecked {
    public static void main(String[] args){
        one R1=new one();
        try {
            R1.method3();
        } catch (Exception e) {
            System.out.println("Arithematic error");
            e.getStackTrace(); //this will tell us the whole stack from where the exception is occuring.
        }

        //Even here the exception is not taken care of hence it
        // goes to the method which has called main method.
        //So its JVM which has called the main method and then the
        //program crashed.
    }
}
