package org.example;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Note {
    public  File file;
    public String nameFile;

    public Note() {
    }
    public void addFile(){
        try{
            while (true){
                System.out.println("Введите название.");
                this.nameFile= IU.nameDB();
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/"+nameFile+".txt");
                this.file = new File(pathFile);
                if(file.createNewFile()){
                    System.out.println("Создана БД для внесения заметок.");
                    break;
                }else {
                    System.out.println("Такое название уже занято, пробуйте ещё");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public boolean addLine() throws IOException {

        if (this.file.exists()){
            FileWriter fw = new FileWriter(this.file, true);
            StringBuilder string = new StringBuilder();
            System.out.println("Введите заметку\n");
            String line = IU.nameDB();
            if (line.equals("stop")){
                return false;
            }
            Date data = new Date();
            string.append(data);
            string.append(": ");
            string.append(line);
            string.append("\n");
            System.out.println(string);
            fw.write(String.valueOf(string));
            fw.close();
        }else System.out.println("У вас не создана база для заметок.");
        return true;
    }

}

