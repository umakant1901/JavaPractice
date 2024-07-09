import IQ.FileHandingBasedQuestion;
import IQ.OccurencyCount;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        // to check repeatation of words or character
        String str1="adsfrdwcexdsewdf";
        String str2="Hello world , welcome to real world and to learn codes";

//        System.out.println(System.getProperty("user.dir"));

        String filepath=System.getProperty("user.dir")+"/src/resources/NormalTextFile.txt";

        FileHandingBasedQuestion fileIQ=new FileHandingBasedQuestion();

        fileIQ.setDataFromTextFile(filepath,"Hello world...! \n");
        fileIQ.appendDataToTextFile(filepath,"learning Java \n");
        fileIQ.appendDataToTextFile(filepath,"then I will go for Python...! \n");
        System.out.println(fileIQ.getDataFromTextFile(filepath));

    }
}
