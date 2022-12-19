package QuestionSolve;
import java.util.*;

public class MissingNumber_easy_Accio {

    //dobt

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // input first array -> (HashMap)
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        //input all together in an array
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<n;i++)
        {
            if(mp.containsKey(arr[i]))
            {
               int value =  mp.get(arr[i]);
               value +=1;
                mp.put(arr[i],value);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }


        // input second array -> (HashMap)
        int m = scn.nextInt();
        int[]arr2= new int[m];
        for(int i = 0; i<m;i++)
        {
            arr2[i] = scn.nextInt();
        }


        Arrays.sort(arr2);
        ArrayList<Integer> out = new ArrayList<>();
        for(int i = 0; i<m;i++)
        {
            if(!mp.containsKey(arr2[i]))
            {
                out.add(arr2[i]);
//                System.out.print(arr2[i] + " ");
            }
            else if(mp.containsKey(arr2[i]) && mp.get(arr2[i])>=1)
            {
                int value = mp.get(arr2[i]) -1;
                mp.put(arr2[i],value);

            }
            else if(mp.get(arr2[i]) == 0)
            {
//                System.out.print(arr2[i] + " ");
                out.add(arr2[i]);
            }
        }


        for(Map.Entry<Integer,Integer> mapE : mp.entrySet())
        {
            if(mapE.getValue() > 0)
            {
//                System.out.print(mapE.getKey() +" ");
//                out.add(arr2[mapE.getKey()]);
                out.add(mapE.getKey());
            }
        }


        Collections.sort(out);
        for(int i : out)
        {
            System.out.print(i+" ");
        }



    }
}
