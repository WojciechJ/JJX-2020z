import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {

    private String p = javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "\\lista_mieszkancow.txt";
    private Path path = Paths.get(p);
    Data data;

    public File(Data person)
    {
        data = person;
        if (Files.exists(path))
            oldFile();
        else if (Files.notExists(path))
            newFile();
    }
    private void oldFile(){
        boolean d = false;

        PrintWriter saveFile = null;
        try {
            saveFile = new PrintWriter(p+".tmp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Long x = Long.parseLong(data.data_pin.substring(0,11));
            Scanner scanner = new Scanner(new java.io.File(p));
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                Long y = Long.parseLong(s.substring(0,11));
                if(x/y==1) {
                    saveFile.println(data.data_pin + " " + data.data_name + " " + data.data_surname + " " + data.data_city);
                    d = true;
                }else
                    saveFile.println(s);
            }
            scanner.close();

            if(d==false)
                saveFile.println(data.data_pin + " " + data.data_name + " " + data.data_surname + " " + data.data_city);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        saveFile.close();

        try {
            Files.deleteIfExists(Paths.get(p));
        } catch (IOException e) {
            e.printStackTrace();
        }

        java.io.File oldfile = new java.io.File(p+".tmp");
        java.io.File newfile = new java.io.File(p);

        oldfile.renameTo(newfile);
    }

    private void newFile(){
        PrintWriter newFile = null;
        try {
            newFile = new PrintWriter(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        newFile.println(data.data_pin + " " + data.data_name + " " + data.data_surname + " " + data.data_city);
        newFile.close();
    }
}
