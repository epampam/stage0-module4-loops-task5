package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length == 0 || height == 0) {
            System.out.print("");
            return;
        }
        String topBottom = "8".repeat(length);
        String middle = "8" + " ".repeat(length - 2) + "8";
        for (int i = 0; i < height; i++) {
            System.out.println(i == 0 || i == height - 1 ? topBottom : middle);
        }
    }
}
