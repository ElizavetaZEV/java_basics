
public class Loader
{
    public static void main(String[] args)
    {
        Cat sima = new Cat();

        System.out.println("Sima weight: " + sima.getWeight());

        while (1000 <= sima.getWeight()){
            sima.meow();
        }

        System.out.println(sima.getStatus());

        Cat murka = new Cat();

        System.out.println("Murka weight: " + murka.getWeight());

        while (9000 >= murka.getWeight()){
            murka.feed(3.6);
        }
        System.out.println(murka.getStatus());

        Cat barsik = new Cat();

        System.out.println("Barsik weight: " + barsik.getWeight());

        barsik.eat();
        System.out.println("Barsik weight: " + barsik.getWeight());

        for (int i = 100;  i < 150;i = i + 25){
            barsik.pee();}
        System.out.println("Barsik weight: " + barsik.getWeight());




    }
}