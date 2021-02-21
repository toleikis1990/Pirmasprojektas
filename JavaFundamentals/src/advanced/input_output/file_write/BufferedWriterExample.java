package advanced.input_output.file_write;

import advanced.input_output.InputOutputUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try( BufferedWriter br = new BufferedWriter(new FileWriter(InputOutputUtils.RESULT_FILE_LOCATION))){
        String text = "Siandien yra sekmadienis \napsiniauke \npliusine temperatura";
        br.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());

        }
    }
}
