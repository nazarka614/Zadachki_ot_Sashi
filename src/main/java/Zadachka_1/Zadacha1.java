package Zadachka_1;

public class Zadacha1 {
    public static void main(String[] args) {
        System.out.println(stringReverse("Nazar"));
    }


    public static String stringReverse(String string){
        char[] charArray = string.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }
}

