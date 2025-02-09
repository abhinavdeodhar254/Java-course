//Now hee from the previous example we will concatinate the two streams.

String strings[]={"one","two","three"};
Arrays.stream(Strings)
        .sorted(reverse.reverseOrdered())
        .forEach(System.out::println);

stream.of("four","five","six")
        map(Stirng::toUpperCase())
        .forEach(System.out::println);

//We will be concatinating these two streams.
//initialize these two streams to the default variable and comment out the for each loop in both.

var firststream=Arrays.stream(Strings)
        .sorted(Comparator.reverseOrdered())
        // .forEach(System.out::println);

var SecondStream=stream.of("four","five","six")
        map(Stirng::toUpperCase())
        // .forEach(System.out::println)

//As of now as both the stream do not have any termination operation they wont be executing. 

//so from this we will further concatinate them.
//stream.concat is used to concatinate two different streams.

stream.concat(SecondStream, firststream)

//now we will add the forEach loop to this statement.

stream.concat(SecondStream, firststream)
        .forEach(System.out::println);

//Here we have added the termination operationby using forEach loop. so here what happens is, soon the compiler hits the termination operation in stream and stream 2 the intermediate operations will start executing. 

//here both the operations are different the stream 1 has  the sorting operation and stream two has the map operation.

//Hence from the first file it is proved that the termination operation need not to be written as soon as the stream is and its intermediate operations are written.

//here i have wrote the termiantion opertaion for both the streams at single time after concatinating them.

//Streams are used for performing operations on the data sets in optimised way.

//here we can see that concatination operation will execute after the sort operation and map opeartion are executed. that is the most optimised way that the stream can act. 

//once again let me clarify this stream one is written with  its set of intermediate operations seperately.
// same goes with the stream 2.

//after that the new operation of concatination was written by termiantion statement. this proves that the termination operation can be written anywhere in the program.

//here both the streams are consumed now. if ahead of the program if i decided to reconsume any of these two streams then it will give me and error. 

//refer to the  coding file for the code. the name is StreamSecondProgram.java