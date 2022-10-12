
// 2. Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга
public class Zad2 {

    public static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    public static boolean Revers(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }

    public static void main(String[] args) {

        System.out.print(" Первая строка: мир ;");
        String str1 = "мир";
        System.out.print(" Вторая строка: рим ");
        String str2 = "рим";
        System.out.println();
        System.out.printf("Переворачиваем первую строку: %s\n", reverseStr(str1));
        System.out.printf("Переворачиваем вторую строку: %s\n", reverseStr(str2));

        System.out.println();
        if (Revers(str1, str2)) {
            System.out.println("Введенные вами строки являются вращением друг друга");
        } else
            System.out.println("Введенные вами строки НЕ являются вращением друг друга");

    }
}

