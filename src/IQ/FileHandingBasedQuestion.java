package IQ;

import java.io.*;

public class FileHandingBasedQuestion {


    public void getDataFromPropertyFile() {

    }

    public String getDataFromTextFile(String filePath) throws IOException {

        StringBuilder content = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        return content.toString();
    }





    public void getDataFromExcelFile() {

    }


    public void setDataFromTextFile(String filePath,String textmessage) throws IOException {

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))) {
            writer.write(textmessage);
        }

    }

    public void appendDataToTextFile(String filePath,String appendMessage) throws IOException {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath,true))){
            writer.append(appendMessage);
        }
    }



    public void setDataFromExcelFile(){

    }





}
