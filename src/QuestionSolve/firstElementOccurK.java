package QuestionSolve;
import javax.sound.midi.Soundbank;
import java.util.*;

public class firstElementOccurK {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n ; i++)
        {
            int num = scn.nextInt();

            map.put(num,(map.getOrDefault(num,0)+1));
            if(map.containsKey(num) && map.get(num)==k)
            {
                System.out.println(num); return;
            }
        }

        System.out.println(-1);

    }
}
