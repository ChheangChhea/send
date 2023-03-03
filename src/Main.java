import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------Set Up------------------");
        Scanner sc = new Scanner(System.in);
        int Total;
        // String room=sc.nextLine();
        System.out.print("Enter floor= ");
        int floor = sc.nextInt();
        System.out.print("Enter room = ");
        int room = sc.nextInt();
        String[][] array = new String[floor][room];

        System.out.println("=======================================");
//        String Total = String[floor][room];


                    Total = floor * room;
                    System.out.println("You  Insert success");
                    System.out.println("Number of floor = " + floor + " floor");
                    System.out.println("Number of room = " + room + " room");
                    System.out.println("Total room = " + Total + " condos");




        System.out.println("############## wellcom to PP Condo #########");

            System.out.println(" 1 => Buy Condo");
            System.out.println(" 2 => Sell Condo");
            System.out.println(" 3 => Search Information");
            System.out.println(" 4 =>Display Information");
            System.out.println(" 5 => Exit");
            System.out.println("----------------------------------");
            System.out.println("Choose operation from(1->5):");
            //int num;

            System.out.print("Choose option( 1 - 5 ) = ");
            int num = sc.nextInt();

            if (num <= 5) {
                switch (num) {
                    case 1:
                        System.out.println("B");
                        break;
                    case 2:
                        System.out.println("S");
                        break;
                    case 3:
                        System.out.println("SE");
                        break;
                    case 4:

                        for (int i = 0; i < floor; i++) {
                            for (int j = 0; j < room; j++) {
                                System.out.print(array[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    default:
                        System.exit(0);
                        System.out.println("Exit");
                }
            }
    }


}