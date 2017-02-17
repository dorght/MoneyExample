/**
 * Created by smurphy on 2/16/2017.
 */
public class Bank {

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }

    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
