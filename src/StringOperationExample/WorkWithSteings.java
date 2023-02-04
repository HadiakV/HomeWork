package StringOperationExample;

import java.sql.SQLOutput;

public class WorkWithSteings {
    public static void main(String[] args){
        String text = "  Это текст для проверки работы методов типа String  ";

        System.out.println("Our working text is - " + text);

        String testString1 = "работ";


        boolean resultContains = text.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " + resultContains);

        //-------- 1 этап -------

        testString1 = "Pert";

        resultContains = text.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " + resultContains);

        String textUpperCase = text.toUpperCase();

        System.out.println(textUpperCase);
        System.out.println(text.toLowerCase());

        System.out.println(text);


    }
}
