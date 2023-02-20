package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength == 0) {
            System.out.print("");
        } else {
            String line = "8".repeat(sideLength);
            for (int s = 0; s < sideLength; s++) {
                System.out.println(s == 0 || s == sideLength - 1 ? line : "8" + " ".repeat(sideLength - 2) + "8");
            }
        }
    }
}