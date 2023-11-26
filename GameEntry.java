public class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[7];
        A[4] = new GameEntry(350);

        GameEntry[] B = A.clone();
        A[4].score = 550;

        System.out.println("A[4] score: " + A[4].score);
        System.out.println("B[4] score: " + B[4].score);
    }
}
