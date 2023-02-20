package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) return;
        int mid = sideLength / 2;
        for (int i = 0; i < sideLength; i++)
            System.out.println(i == mid ? "8".repeat(sideLength) : " ".repeat(mid) + "8" + " ".repeat(mid));
    }
}