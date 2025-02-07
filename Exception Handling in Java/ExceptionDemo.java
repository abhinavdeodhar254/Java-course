class ExceptionDemo{
    public static void main(String[] args) {
    
    
    int samplearray[]={1,0,2,3,4,5,6,7};
    int result;

    try
    {
        result=samplearray[0]/samplearray[1];
    }
    catch(ArithmeticException e){
        System.out.println("dividing by zero not allowed " +e);

    }

    System.out.println("you are good to go");
}

}

    