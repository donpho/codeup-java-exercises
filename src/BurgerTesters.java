public class BurgerTesters {
    public static void main(String[] args) {

//        BurgerTools burger = new BurgerTools();
//        burger.mostPopularTopping = "cheese";
//        burger.averageDaysBeforeExpiration = 7;
//        burger.temperatureWhenCooked = 165;
//        System.out.println(burger.mostPopularTopping);
//        System.out.println(burger.averageDaysBeforeExpiration);
//        System.out.println(burger.temperatureWhenCooked);
//        burger.grill();

//        BurgerTools burger = new BurgerTools("cheese");
//
//        burger = new BurgerTools(7,165);
//
//        System.out.println(burger.getCookingTemperature());
//        burger.grill();

        BurgerTools burger = new BurgerTools("cheese", 7,165);
        System.out.println(burger.getTopping());
        System.out.println(burger.getExpiration());
        System.out.println(burger.getCookingTemperature());
        burger.grill();

    }
}
