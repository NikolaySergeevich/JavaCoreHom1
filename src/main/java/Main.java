import org.example.IU;
import org.example.Note;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IU.hello();
        Note i = new Note();
        i.addFile();
        while (true){
            boolean flag = i.addLine();
            if (!flag){
                break;
            }
        }


    }
}