public class finallyBlockImplimentation {
//finally block is used to mostly close the resources when the eception is triggered.
//finally block gets executed in either way if the exception is triggered or not triggered.

    public static void main(String[] args){

        int a=0;
        int b=10;
        int c;
        try{
            c=b/a; 

        }catch(ArithmeticException e){
            System.out.println("divining by zero");
        }
        finally{
            System.out.println("finnaly block executed");
            //all the instructions written here will be executed.
            //Hence this is used to close the used resources.
        }

    }
    
}
