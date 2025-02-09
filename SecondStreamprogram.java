
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SecondStreamprogram {
    public static void main(String[] args){
        String strings[]={"one", "two","three"};
        var Firststream=Arrays.stream(strings)
        //initialized it to FirstStream variable
            .sorted(Comparator.reverseOrder());
            //after commenting the termination instruction give semicolon to the previous statement.
            // .forEach(System.out::println);


        var SecondStream=Stream.of("four","five","Six")
                .map(String::toUpperCase);
                //forEach(System.out::println)

        Stream.concat(SecondStream, Firststream)
                .forEach(System.out::println);
    }
}

/*
Output:
FOUR
FIVE
SIX
two
three
one
 */