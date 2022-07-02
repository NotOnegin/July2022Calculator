public class ArabCalculate {

    //Этот класс вычисляет математическую операцию арабских чисел в трёх ступенях:

    static int toCalculate (String a, char x, String b) {

        //1.Создаётся переменная для сохранения результата операции.
        // Строки a и b преобразуются в int:
        int arabResult = 0;
        int firstVariable = Integer.parseInt(a);
        int secondVariable = Integer.parseInt(b);

        //2.Проверяется условие, чтобы введённые числа были не менее 0 и не более 10:
        if (((firstVariable < 0) || (firstVariable > 10)) ||
           ((secondVariable < 0) || (secondVariable > 10))) {
            throw new RuntimeException("Нужно ввести числа от 0 до 10.");
        }

        //3.Выполняется вычисление и результат сохраняется в переменную result:
        if (x == '+') {arabResult = firstVariable + secondVariable;}
        if (x == '-') {arabResult = firstVariable - secondVariable;}
        if (x == '/') {arabResult = firstVariable / secondVariable;}
        if (x == '*') {arabResult = firstVariable * secondVariable;}
        return arabResult;
    }
}
