
public class Cat
{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    private Color color;

    public Color getColor() {
        return color;
    }
    public void setColor () {
       this.color = Color.BLACK; }

    private double originWeight;

    public double getOriginWeight() {
        return originWeight;
    }
    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    private double weight;

    public Double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    private double minWeight;
    public double getMinWeight() {
        return minWeight;
    }
    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    private double maxWeight;
    public double getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight() {
        this.maxWeight = maxWeight;
    }

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
    public Cat (String name, double weight, Color color, double originWeight, double minWeight, double maxWeight){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.originWeight = originWeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    ///конструктор копии
    public Cat (Cat other){
        this(other.getName(), other.getWeight(), other.getColor(),
                other.getOriginWeight(), other.getMinWeight(), other.getMinWeight());
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

            @Override
            public String toString(){
        return ("Cat: "+ name + ". " + "Weight: " + weight + ". " + "Color: " + color);
            }
    }