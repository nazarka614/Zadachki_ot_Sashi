package Zadachka_2;

public class Zadachka2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("qwewq9"));
    }

    public static boolean isPalindrome(String string){
        boolean ispoli = false;
        char[] charArray = string.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        if (string.equals(resultString)){
            ispoli = true;
        }
        return ispoli;
    }
}
