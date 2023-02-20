package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            int spaces = Math.min(i, height - i - 1);
            int stars = height - 2 * spaces;
            System.out.println(" ".repeat(spaces) + "8".repeat(stars) + " ".repeat(spaces));
        }
    }
}


