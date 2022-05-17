public class SnakeAndLadderProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");
        int position = 0;
        System.out.println("You are in " + position + " position");

        int diecheck = 1 + (int) (Math.random() * 6);
        System.out.println("The number on dies is :" + diecheck);

        int option = (int) (Math.random() * 4);

        switch (option) {
            case 1:
                System.out.println("No play: Player in same position");
                break;
            case 2:
                System.out.println("Ladder: Player moves ahead");
                break;
            case 3:
                System.out.println("Snake: Player moves behind");
        }
    }
}