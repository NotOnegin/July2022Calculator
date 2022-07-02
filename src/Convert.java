import static java.lang.String.join;
import static java.util.Collections.nCopies;
public class Convert {

    //Этот класс помогает преобразовать римские числа в арабские и обратно:

    //1.Преобразование из римских чисел в арабские:
    static public String getArabicNumber (String a) {
        switch (a) {
            case "I":a = "1";break;

            case "II":a = "2";break;

            case "III":a = "3";break;

            case "IV":a = "4";break;

            case "V":a = "5";break;

            case "VI":a = "6";break;

            case "VII":a = "7";break;

            case "VIII":a = "8";break;

            case "IX":a = "9";break;

            case "X":a = "10";break;

            default:
                throw new RuntimeException ("Используются одновременно разные системы счисления или формат строки введена некорректно");
        }
        return a;
    }

    //2.Преобразование из арабских чисел в римские:
    public static String getRomanNumber(int number) {
        return join("", nCopies(number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }
}
