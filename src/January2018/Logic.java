package January2018;

public class Logic {

    static int getFirstPositiveNumber(int[] inputArray) {
        int lastIndex = inputArray.length - 1;
        int nextExpectedValue = 0;
        for (int index = 0; index < inputArray.length; index++) {
            int currentValue = inputArray[index];
            nextExpectedValue = currentValue + 1;

            if (index == lastIndex) {
                if (currentValue <= 0) nextExpectedValue = 1;
                if (currentValue > 0) nextExpectedValue = currentValue + 1;
                break;
            }

            int nextActualValue = inputArray[index + 1];
            if (currentValue < 0 || currentValue == nextActualValue) continue;

            if (nextExpectedValue != inputArray[index + 1]) break;
        }
        return nextExpectedValue;
    }
}
