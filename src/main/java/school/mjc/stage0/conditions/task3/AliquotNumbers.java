package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int aliquot = second % first;

        if (aliquot == 0) {
            System.out.println("Aliquot");
        }
        else {
            System.out.println("Not aliquot");
        }
    }
}
