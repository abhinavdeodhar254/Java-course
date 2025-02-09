//Here we will import the java.util.Arrays class to generate the stream from an array.
import java.util.Arrays;


//Let us consider that the string of array as the source of our Stream.

String [] strings={"One", 'Two', "Three"};

//this is the string with the variable name strings.

//Now we will call Arrays of Stream and will pass in the strings array in it that we have created just now.

Arrays.stream(strings) //this here is the source of the stream.

//we use (.) operatior to add the intermediate operation to the stream. so now we will pass the intermediate operation of sorting in reverse order on the string.

Arrys.stream(strings)
        .sort(Comparator.reverseOrder())

//this intermediate operation says  that we need to sort the array in the reverse order.

//we will use the foreach loop as the termination operator.

Arrays.stream(Strings)
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

//this is the simple stream operation where we are have a source to the stream as the array of string 
//we are also having the intermediate operation of sorting in reverse order
//we are also having the termination opertation which will initialize all the operations which are intermediate in the stream.

//Stream interface has a method which can directly take any type of datatype in it.
//That method is staticof()


//Here is the syntax

stream.of(T...values)

//this means that this is the stream.of any data type <T> and any number of elements <values>.

// example:

stream.of("four","five","six");

//now again we will add the another intermediate operation that is map.
//map operation will go across every element in the string and perform the operation on every element that we asked for.

stream.of("four","five","six")
        .map(String::toUpperCase())
        .forEach(System.out::println)

        
        //remember the syntax for stream.of the <T> stands for the data type. 
        // Here is the same thing during the operations we can specify the datatype and the operation method 
        // that we are using will know that we are talking about the stream that we have  just declared.

        // sysntax:
        // stream.of(<t>...<values>)
        //         .map(<t>.operation)
       
