public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(12345);
    System.out.println(sumDigits(12345));

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

    Object object = null;
    String objectString = String.valueOf(object);
    System.out.println(objectString);

   String[]chislo = String.valueOf(12345).split("");
int result = 0;
for (int i = 0; i < chislo.length; i++){
  result += Integer.parseInt(chislo[i]);
}
    return result;
  }
}
