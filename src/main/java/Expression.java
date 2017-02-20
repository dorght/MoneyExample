/**
 * Created by smurphy on 2/16/2017.
 */
interface Expression {
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
    Expression times(int multiplier);
}
