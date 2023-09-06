public class Lemonade extends Drinks{
    public Lemonade(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() + " (Recipe: lemon juice 150ml, ice 50g, water 150ml, lime 20g). Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");
    }
}