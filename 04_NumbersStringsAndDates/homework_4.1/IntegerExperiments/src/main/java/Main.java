public class Main {
    /// проверка для гита
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        int sum = sumDigits(12345);
        System.out.println(sumDigits(12345));

        int i1 = 203;
        char c1 = (char) i1;
        System.out.println(i1 + " / " + c1);

        for (int i = 1040;   i < 1104;  i++){
            char c = (char) i;
            System.out.println(i + " / " + c);
        }

    }
  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

    public static int sumDigits(Integer number) {
        //@TODO: write code here and delete TODO line

        //проверка
        if (number == null) {
            return -1;
        }

        Object object = null;
        String objectString = String.valueOf(object);
        System.out.println(objectString);


        String[] chislo = String.valueOf(number).split("");
        int result = 0;
        for (int i = 0; i <= chislo.length; i++) {
            result += Character.getNumericValue(i);
        }
        return result;




    }
}