
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

class StreamFirstProgram{
    public static void main(String[] args){
        String strings[]={"one","two","three"};
        Arrays.stream(strings)
        //this is the source of the stream.
                .sorted(Comparator.reverseOrder())
                //this is the intermediate operation inside the stream where we are sorting the array "strings" in reverse order.
                .forEach(System.out::println);
                //We are transversing along the array with respect to the operation which is performed.

                //here in forEach loop the stream got terminated.
        
        //declaring the stream of strings again.
        //using the interface method of stream. 
        //stream.of - takes in any number of values with any number of data types.

        Stream.of("four","five","six")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //here map will go through every element and then will perform the specified operation.
        //here how does the map knows that type of stream that we are talking?
        //the syntax of stream.of is (<t>...<values>)
        //this literally means that <t> is the datatype and ...<values> is values of any number of elements.
        //in map operation as the string that we entered above has the datatype of string
        //hence in map we have entered the same datatype before specifying the operation.

        //map(<t>.operation) is the syntax.
    }
   
}