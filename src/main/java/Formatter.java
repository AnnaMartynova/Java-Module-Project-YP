public class Formatter {

    public static String roundingCostProduct(double izadadd) {

      String format = String.format("%.2f", izadadd);
      return format;
    }

    public static String rubleCorrectCase(double price) {

      int  count = (int) Math.floor(price);

        {
            double preLastDigit = count % 100 / 10;
            if (preLastDigit == 1)
            {
                return "рублей";
            }

            switch (count % 10)
            {
                case 1:
                    return "рубль";
                case 2:
                case 3:
                case 4:
                    return "рубля";
                default:
                    return "рублей";
            }
        }
    }
}
