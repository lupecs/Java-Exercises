package hackerrank.InterviewChallenges.Sorting.Medium;
//works
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        //linear search
        for (int i = 0; i < n; i++) {
            player[i] = new Player(sc.next(), sc.nextInt());
        }
        sc.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

    }
}

class Player {
    String name;
    int score;

    //create into objects
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b){
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        return -Integer.compare(a.score, b.score);
    }
}