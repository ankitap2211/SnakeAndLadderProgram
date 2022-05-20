public class SnakeAndLadderProgram {
    public static final int position = 0;
    public static final int option;

    public static void main(String[] args) {
        int startposition = 0;
        int NO_PLAY = 0;
        int IS_LADDER = 1;
        int IS_SNAKE = 2;
        System.out.println("Welcome to Snake and Ladder Program");
        System.out.println("Starting position of player is " + startposition);
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
        while (position < 100) {
            int dieNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Dice number is " + dieNumber);

            int option = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("Player option is " + option);

            switch (option) {
                case 1:
                    position = dieNumber + position;
                    System.out.println("Position of the player after ladder is " + position);
                    break;
                case 2:
                    position = position - dieNumber;
                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Position of the player after the snake is " + position);
                    break;
                default:
                    System.out.println("No play");
            }
        }
    }
}