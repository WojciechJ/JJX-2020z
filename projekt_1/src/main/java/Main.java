import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Miasto: ");
        String city = s.nextLine();
        System.out.print("Imie: ");
        String name = s.nextLine();
        System.out.print("Nazwisko: ");
        String surname = s.nextLine();
        System.out.print("Pesel: ");
        String pin = s.nextLine();

        if(isSet(city) && isSet(name) && isSet(surname) && isSet(pin)) {
            Data x = new Data(city, name, surname, pin);
            if (x.checkPIN()) {
                File p = new File(x);
            }

            System.out.println(message(x.checkPIN()));
        }else
            System.out.println("Podano puste dane");
    }

    public static boolean isSet(String string){
        if(!string.trim().isEmpty())
            return true;
        else
            return false;
    }

    public static String message(boolean x){
        if(x==false)
            return "Podany pesel nie jest poprawny!";
        else
            return "Wpis zapisany w pliku: " + javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "\\lista_mieszkancow.txt";
    }
}
