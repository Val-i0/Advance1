package Module3;

public class LotteryChecker {
    public static void main(String[] args) {
        checkText("home", "home");
    }


    public static void checkText (String text, String text2) {
        if (text.equals(text2)) {
            System.out.println("Вие печелите голямата награда");
        } else {
            System.out.println("Опитайте пак");
        }
    }
}
