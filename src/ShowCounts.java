package src;

public class ShowCounts {
    public static void main(String[] args) {

        System.out.println("Pętla while:");
        double count = 0;
        while (count < 3.1) {
            System.out.print(count);
            System.out.print(", ");
            count = count + 0.1;
        }

        System.out.println("\nPętla do while:");
        count = 0;
        do {
            System.out.print(count);
            System.out.print(", ");
            count = count + 0.1;
        }
        while(count<3.1);
    }
}
