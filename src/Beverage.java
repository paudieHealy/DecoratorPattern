/**
 * Created by paudie on 06/10/2017.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
