/**
 * Created by smurphy on 2/15/2017.
 */
public class Money {
    int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
s