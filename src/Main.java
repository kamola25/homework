import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        int x = Math.round(rn.nextInt(50));
        ageTemperature(x,x);
        System.out.println();
        ageTemperature(x,x);
        System.out.println();
        ageTemperature(x,x);

        System.out.println();
        System.out.println("Mne 18 i temperatura na ulise 46 gradusov");
        ageTemperature(18,46);
        System.out.println();

        System.out.println("Mne 38 i temperatura na ulise -12 gradusov");
        ageTemperature(38,-12);
        System.out.println();

    }

    public static void ageTemperature(int num1, int num2) {
        if (num1 >= 20 && num1 <= 45 && num2 >= -20 && num2 <= 30) {
            System.out.println("Можно идти гулять!");
        } else if (num1 < 20 && num2 >= 0 && num2 <= 28) {
            System.out.println("Можно идти гулять!");
        } else if (num1 < 45 && num2 >= -10 && num2 <= 25) {
            System.out.println("Можно идти гулять!");
        } else {
            System.out.println("Оставайтесь дома!");
        }


    }

}