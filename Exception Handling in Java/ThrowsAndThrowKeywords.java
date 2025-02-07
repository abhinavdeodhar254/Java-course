class DimensionscannotbeNegative extends Exception{

    @Override
    public String toString(){
        return "lenght or breadth cannot be negative";
    }
}

//here we have define the custom exception. 
//while doing so to string method is overridden from the exception class.

//this is the user define expression  so we need 
//to make changes in the code which will first check the condition
//and then throw the exception for the situations not matching our
//expectations. so we will be using if else statement.


final class rectangleArea{
    int length;
    int breadth;

    public rectangleArea(){
        length=10;
        breadth=5;
        CalculateAreaOfRectangle();
        CalculatePerimeterOfRectangle();
    }
    public rectangleArea(int length, int breadth)throws DimensionscannotbeNegative{
        if(length<0 || breadth<0){
            throw new DimensionscannotbeNegative();
        }
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length)throws DimensionscannotbeNegative{
        if(length<0){
            throw new DimensionscannotbeNegative();
             //always use the object of the defined exception to throw it.
            //We can't catch the exception here because throwing and 
            //catching it at same place wont make any sense rather it was efficient to just catch here instead of defining a custom exception.
            //Hence call this thrown exception in the method where you are calling the set method.
        }else
        {
            this.length=length;
        }
    } //closing the set length method

    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int breadth)throws DimensionscannotbeNegative{
        if(breadth<0){
            throw new DimensionscannotbeNegative();
        }
    }

    public double CalculateAreaOfRectangle(){
        return length*breadth;

    }

    public double CalculatePerimeterOfRectangle(){
        return 2*(length+breadth);
    }


   
}



public class ThrowsAndThrowKeywords {
    public static void main(String[] args) {

        //here lets initialize the object of the rectangle
        
            rectangleArea R1=new rectangleArea(); //default values will get called
            System.out.println(R1.CalculateAreaOfRectangle() + " Thi is the area of rectangle");
            System.out.println(R1.CalculatePerimeterOfRectangle() + " This is the Perimeter of Rectangle");

            try{
               
                R1.setBreadth(-10);
                R1.setLength(-2);
            }catch(DimensionscannotbeNegative e){
                System.out.println("length or breadth cannot be negative");

            }
            
       
        
            
    
}
}
        
       


        
    
    

