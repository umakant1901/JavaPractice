import IQ.OccurencyCount;

public class Test {

    public static void main(String[] args) {

        // to check repeatation of words or character
        String str1="adsfrdwcexdsewdf";
        String str2="Hello world , welcome to real world and to learn codes";
        OccurencyCount oc=new OccurencyCount();
        oc.getAlphabetOccurenceInString(str1);
        System.out.println("********");
        oc.getWordsOccurenceInString(str2);
        
    }
}
