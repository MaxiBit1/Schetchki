import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean chheck=false;
        int L1C = 0, L1D = 0, L2 = 0, OZU = 0;
        while (chheck!=true) {
            System.out.println("1 - КЭШ команд L1\n" +
                    "2 - КЭШ данных L1\n" +
                    "3 - КЭШ общий L2\n" +
                    "4 - ОЗУ\n" +
                    "5 - Выход");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> L1C++;
                case 2 -> L1D++;
                case 3 -> L2++;
                case 4 -> OZU++;
                case 5 -> chheck = true;
            }
            System.out.println("КЭШ команд L1 " + L1C + "\n"+
                    "КЭШ данных L1 " + L1D + "\n"+
                    "КЭШ общий L2 " + L2 + "\n"+
                    "ОЗУ " + OZU);
            System.out.println("-------------------------------------------------------");
        }
    }
}
