
public class Loader
    {
    public static void main(String[] args)
    {
        Cat asia = new Cat();
        System.out.println("Number of cats: " + asia.getCount());
        System.out.println("Asia weight: " + asia.getWeight() + ". " + asia.getStatus() + ".");
        asia.drink((asia.getWeight()/100));


        Cat sima = new Cat();
        System.out.println("Number of cats: " + sima.getCount());
        System.out.println("Sima weight: " + sima.getWeight() + ". " + sima.getStatus() + ".");
        while (1000 <= sima.getWeight()){
            sima.meow();
        }
        System.out.println("Sima weight: " + sima.getWeight() + ". " + sima.getStatus() + ".");

        Cat murka = new Cat();
        System.out.println("Number of cats: " + murka.getCount());
        System.out.println("Murka weight: " + murka.getWeight() + ". " + murka.getStatus() + ".");
        while (9000 >= murka.getWeight()){
            murka.feed(3.6);
        }
        System.out.println("Murka weight: " + murka.getWeight() + ". " + murka.getStatus() + ".");
        System.out.println("Number of cats: " + murka.getCount());

        Cat barsik = new Cat();
        System.out.println("Number of cats: " + barsik.getCount());
        System.out.println("Barsik weight: " + barsik.getWeight());
        barsik.eat();
        System.out.println("Barsik weight: " + barsik.getWeight()  + ". " + barsik.getStatus() + ".");
        for (int i = 100;  i < 150; i = i + 25){
            barsik.pee();}
        System.out.println("Barsik weight: " + barsik.getWeight() + ". " + barsik.getStatus() + ".");

        Cat lamia = new Cat();
        System.out.println("Number of cats: " + lamia.getCount());
        System.out.println("Lamia weight: " + lamia.getWeight());
        lamia.eat();
        System.out.println("Lamia weight: " + lamia.getWeight() + ". " + lamia.getStatus() + ".");

        Cat baksik = new Cat();
        System.out.println("Number of cats: " + baksik.getCount() + ".");
        System.out.println("Baksik weight: " + baksik.getWeight() + ". " + baksik.getStatus() + ".");
                baksik.feed(100.0);
        System.out.println("Baksik weight: " + baksik.getWeight() + ". " + baksik.getStatus() + ".");

        baksik.feed(8000.0);
        System.out.println("Baksik weight: " + baksik.getWeight() + ". " + baksik.getStatus() + ".");
        System.out.println("Number of cats: " + baksik.getCount() + ".");

        Cat newCat = getKitten();
        System.out.println("Cat");


    }
    public static Cat getKitten(){
        double weight = 100 + 100 * Math.random();
        return new Cat();
    }
}