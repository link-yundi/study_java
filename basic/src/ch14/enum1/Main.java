package ch14.enum1;

public class Main {
    public static void main(String[] args) {
        Rank a = Rank.BRONZE;
        switch (a) {
            case BRONZE:
                System.out.println("第三名");
                break;
            case SLIVER:
                System.out.println("第二名");
                break;
            case GOLD:
                System.out.println("第一名");
                break;
            default:
                System.out.println("loser");
                break;
        }
    }
}
