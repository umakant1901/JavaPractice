package IQ;

import java.util.HashMap;
import java.util.Map;

public class OccurencyCount {

    public void getAlphabetOccurenceInString(String inputString)
    {
        Map<Character,Integer> map=new HashMap<Character,Integer>();

        char[] charArr= inputString.toCharArray();

        for(char c:charArr)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }

        }

        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

    public void getWordsOccurenceInString(String inputString)
    {
        Map<String,Integer> map=new HashMap<String,Integer>();

        String[] stringArr= inputString.split(" ");

        for(String str:stringArr)
        {
            if(map.containsKey(str))
            {
                map.put(str,map.get(str)+1);
            }
            else
            {
                map.put(str,1);
            }

        }

        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }



    }


}
