/**
 * Created by smurphy on 2/15/2017.
 */
class Money implements Expression {
    int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Expression plus (Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
