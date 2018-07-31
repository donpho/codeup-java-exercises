public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish1 = new RestaurantDish();
        dish1.costInCents = 5.50;
        dish1.nameOfDish = "Pho";
        dish1.wouldRecommend = true;
        System.out.println(dish1.costInCents);
        System.out.println(dish1.nameOfDish);
        System.out.println(dish1.wouldRecommend);
        dish1.eat();
    }
}
