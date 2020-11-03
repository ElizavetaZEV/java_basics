
public class Loader
{
    public static void main(String[] args)
    {
        Cat asia = new Cat();
        System.out.println("Asia weight: " + asia.getWeight());
        asia.drink((asia.getWeight()/100));
        System.out.println("Asia count: " + asia.getCount());

        Cat sima = new Cat();
        System.out.println("Sima weight: " + sima.getWeight());
        while (1000 <= sima.getWeight()){
            sima.meow();
        }
        System.out.println(sima.getStatus());
        System.out.println("Sima count: " + sima.getCount());


        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());
        while (9000 >= murka.getWeight()){
            murka.feed(3.6);
        }
        System.out.println(murka.getStatus());
        System.out.println("Murka count: " + murka.getCount());

        Cat barsik = new Cat();
        System.out.println("Barsik weight: " + barsik.getWeight());
        barsik.eat();
        System.out.println("Barsik weight: " + barsik.getWeight());
        for (int i = 100;  i < 150; i = i + 25){
            barsik.pee();}
        System.out.println("Barsik weight: " + barsik.getWeight());
        System.out.println("Barsik count: " + barsik.getCount());

        Cat lamia = new Cat();
        System.out.println("Lamia weight: " + lamia.getWeight());
        lamia.eat();
        System.out.println("Lamia weight: " + lamia.getWeight());
        System.out.println("Lamia count: " + lamia.getCount());

    }
}