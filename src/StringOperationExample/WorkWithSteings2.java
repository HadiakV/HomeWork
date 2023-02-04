package StringOperationExample;

public class WorkWithSteings2 {
    public static void main(String[] args){
        String text = "  Это текст Для проверки Работы методов Типа String  ";

        System.out.println("Our working text is - " + text);

        String testString1 = "работ";


        String textToLowCase = ((String) text).toLowerCase();

        System.out.println(textToLowCase);


        boolean resultContains = textToLowCase.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " + resultContains);

        //-------- 1 этап -------//


        String textAfterTrim =  text.trim();

        System.out.println(textAfterTrim);

        String oldString = "In java, Olga the best, super java programmer!";

        String newString = oldString.replace('j','*');
        System.out.println(newString);

        newString = oldString.replace("Olga","@All group 240123");
        System.out.println(newString);


        System.out.println(newString.indexOf('@'));


    }
}
