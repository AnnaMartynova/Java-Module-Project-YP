import java.util.Scanner;

public class Main {

    private static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public static void main(String[] args) {

        //После запуска программа должна спрашивать у пользователя, на скольких человек необходимо разделить счёт.


        int numberPeople;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество людей (больше или равно 1)");
            String value = scanner.next();
            boolean isNumber = isNumber(value);

               if (isNumber) {
                   numberPeople = Integer.parseInt(value);

                   if (numberPeople == 1) {
                       System.out.println("Нет смысла ничего считать и делить.");
                   } else if (numberPeople < 1) {
                       System.out.println("Это некорректное значение для подсчёта.");
                   } else if (numberPeople > 1) {
                       break;
                   }
               } else {
                   System.out.println("Введите корректное количество гостей.");
               }
           }
            



        //Запросите у пользователя название товара и его стоимость.
        Calculator calculator = new Calculator();



        while (true) {
            Scanner scannerr = new Scanner(System.in);

            System.out.println("Введите название товара");
            String productName = scannerr.nextLine();


            System.out.println("Введите стоимость товара (в формате руб,копейки) ");
            double costGoods = scannerr.nextDouble();




            calculator.addProduct(productName, costGoods);
            System.out.println("Товар успешно добавлен");

            calculator.countingGoods( numberPeople,  costGoods);

            System.out.println("Хотите добавить еще один товар или Завершить?");
            String addOrFinish = scannerr.next();

            if (addOrFinish.equalsIgnoreCase("Завершить")) {
                System.out.println("Все добавленные товары : " +
                        "\n " + calculator.product +
                        "\n"  + "Общая сумма счета :" + " " +Formatter.roundingCostProduct(calculator.totalPrice)+" "+Formatter.rubleCorrectCase(calculator.totalPrice) +
                        "\n"  + "Сумма счета на каждого человека :" + " " +Formatter.roundingCostProduct(calculator.personalAmount)+" "+ Formatter.rubleCorrectCase(calculator.personalAmount));
                break;

            }

        }

    }
}