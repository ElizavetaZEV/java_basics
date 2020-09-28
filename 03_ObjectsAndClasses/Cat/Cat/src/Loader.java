
public class Loader
{
        public static void main(String[] args)
    {
       Cat murka = new Cat();
       System.out.println ("Murka weight: " + murka.getWeight());

       murka.meow();
       System.out.println("Murka weight: " + murka.getWeight());

      Cat sima = new Cat();
        System.out.println("Sima weight: " + sima.getWeight());
       sima.drink(3.5);
       System.out.println("Sima weight: " + sima.getWeight() + ". " + "Cat " + sima.getStatus());

       System.out.println("Asia weight: " + asia.getWeight());
        asia.feed(4.8);
        System.out.println("Asia weight: " + asia.getWeight() + ". " + "Cat " + asia.getStatus());

        Cat laska = new Cat();
        System.out.println("Laska weight: " + laska.getWeight() + ". " + "Cat " + laska.getStatus());

        Cat barsik = new Cat();
        System.out.println("Barsik weight: " + barsik.getWeight());

        while (!(barsik.getStatus() >= (weight < minWeight)){
        barsik.meow();
        }
        System.out.println("Barsik weight: " + barsik.getWeight() + ". " + "Cat " + barsik.getStatus());
    }
        }
