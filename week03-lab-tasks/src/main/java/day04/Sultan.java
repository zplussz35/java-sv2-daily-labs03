package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison= new Prison();
        for (int i = 1; i < 101; i++) {
            prison.openFreeCells(i);
        }
        System.out.println("A szabaduló cellák sorszámai:");
        System.out.println(prison.getFreeCells());
    }
}
