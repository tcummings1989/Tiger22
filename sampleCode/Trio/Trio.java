package studentWork.trio;

public class Trio implements MenuItem {

    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    String getName() {
       Return = System.out.println(this.sandwich + " / " + this.salad + " / " + this.drink + " Trio");
    }

    String getPrice(){
        Return = this.sandwich.getPrice() + this.salad.getPrice() + this.drink.getPrice();
    }
}
