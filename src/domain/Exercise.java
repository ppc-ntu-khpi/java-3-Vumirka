package domain;
/**
 * Клас для обчислення кількості номерів бойової техніки,
 * які містять "нещасливі" значення: цифру 4 або число 13.
 * Вхідні дані:
 * maxNumber - максимальний номер техніки (100000).
 */
public class Exercise {

    public static int Calculate(int maxNumber) {
        int excludedCount = 0;

        for (int i = 1; i <= maxNumber; i++) {
            String number = String.valueOf(i);

            if (number.contains("4") || number.contains("13")) {
                excludedCount++;
            }
        }

        return excludedCount;
    }
}
