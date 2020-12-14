
public class Cat
{
    private Color color;

    public Color getColor() {
        return color;
    }
    public void setColor () {
       this. color = Color.BLACK; }

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public static final int LEGS_COUNT = 4;
    public static final double MAX_WEIGHT = 9000.0;
    public static final double MIN_WEIGHT = 1000.0;

    public static int count = 0;

    public boolean isAlive = true; {     if (isWeightNormal());    }
    
    public boolean isWeightNormal()
    {
        return (weight > minWeight && weight < maxWeight);
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public static int getCount() {
        return count;
    }

    void eat(){
        if(isAlive);
        weight = weight + 150;
        System.out.println("Feed: 150.00 gr.");
        return;
    }

    public void meow()
    {
        if(isAlive);{
        weight = weight - 1;
        System.out.println("Meow");

        if(!isWeightNormal()) {
            count--;
            System.out.println("Котика нет с нами");
        }
        }
    }

    public void feed(Double amount){
        if(isAlive); {
            weight = weight + amount;
            if (!isWeightNormal()) {
                count--;
                System.out.println("Котика нет с нами");
            }
        }
    }

    public void drink(Double amount)
    {
        if(isAlive);
        {
            weight = weight + amount;
            if (!isWeightNormal()) {
                count--;
                System.out.println("Котика нет с нами");
            }
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
                   }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public void pee(){
        if(isAlive);
        weight = weight - (getWeight()/100);
                System.out.println("Meeow,meeow");
            }


    }