public class BurgerTools {
    private String mostPopularTopping;
    private int averageDaysBeforeExpiration;
    private int temperatureWhenCooked;


    public void grill(){
        System.out.println("Grillin Burgers");
    }

    public BurgerTools(String topping){
        mostPopularTopping = topping;
    }

    public BurgerTools(int expiration, int temperature){
        averageDaysBeforeExpiration = expiration;
        temperatureWhenCooked = temperature;
    }

    public String getTopping(){
        return mostPopularTopping;
    }

    public int getExpiration(){
        return averageDaysBeforeExpiration;
    }

    public int getCookingTemperature(){
        return temperatureWhenCooked;
    }

    public BurgerTools(String topping, int averageDay, int temperature){
        this.mostPopularTopping = topping;
        this.averageDaysBeforeExpiration = averageDay;
        this.temperatureWhenCooked = temperature;
    }

}
