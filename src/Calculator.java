import java.util.Scanner;
public class Calculator {

    //Этот класс проводит математическую операцию в четырёх ступенях:

    public static void main(String[] args) {

        System.out.println("Привет! Введите математическую операцию в формате \"a + b\"");

        //1.Сканируем ввод пользователя.
        // Присваиваем значение ввода в строку userInput.
        // Проверяем корректность ввода математической операции (должно быть в формате a + b):
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine().toUpperCase();
         if (userInput.length() <= 3) {
             throw new RuntimeException("строка не является математической операцией или введена без пробелов между операндами");
         }

        //2.Разбиваем строку userInput на три разных строки (на строки а(операнд), b(операнд), x(оператор)):
        int operatorIndex = userInput.indexOf(" ") + 1;//эта переменная помогает определить индекс оператора.
        String a = userInput.substring(0,(operatorIndex-1));
        String b = userInput.substring((operatorIndex+2));
        char x = userInput.charAt(operatorIndex);

        //3.Проверяем корректность ввода формата математической операции и если были введены арабские числа, то результат работы метода выводится на консоль:
        try {
            if (b.length() > 2) {
                throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            System.out.println(ArabCalculate.toCalculate(a, x, b));
        }

        //4.Проверяем корректность ввода формата математической операции и если были введены римские числа, то результат работы метода выводится на консоль:
        catch (Exception e) {
            if (b.length() > 4) {
                throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            System.out.println(RomanCalculate.toCalculate(a, x, b));
        }
    }
}
