public class RomanCalculate {

    //Этот класс вычисляет математическую операцию римских чисел в трёх ступенях:

    static String toCalculate (String a, char x, String b) {

        //1.Введёные римские числа преобразуются в арабские и вычисляются с помощью метода:
        String c = Convert.getArabicNumber(a);
        String d = Convert.getArabicNumber(b);
        int result = ArabCalculate.toCalculate(c, x, d);

        //2.Далее проверяется корректность результата, чтобы оно было в допустимом диапазоне:
        if ((result <= 0) || (result > 4000)) {
            throw new RuntimeException("Результатом работы калькулятора с римскими числами могут быть только положительные числа.");
        }
        //3.Результат преобразуется в римское число и сохраняется в строку romanResult:
        String romanResult = Convert.getRomanNumber(result);
        return romanResult;
    }
}
