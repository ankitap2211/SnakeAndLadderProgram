public class SnakeAndLadderProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");
        int position = 0;
        System.out.println("You are in " + position + " position");

        int diecheck = 1 + (int) (Math.random() * 6);
        System.out.println("The number on dies is :" + diecheck);
    }
}
