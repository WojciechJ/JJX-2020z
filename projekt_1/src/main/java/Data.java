public class Data {
    String data_city;
    String data_name;
    String data_surname;
    String data_pin;
    boolean ok;

    public Data(String city, String name, String surname, String pin){

        data_city = city;
        data_name = name;
        data_surname = surname;
        data_pin = pin;

        ok = true;
    }

    public boolean checkPIN(){

        if(data_pin.length()!=11)
            ok = false;

        if(ok) {
            try {
                long tmp = Long.parseLong(data_pin);
            } catch (NumberFormatException nfe) {
                ok = false;
            }
        }

        if(ok) {
            int part_1 = Integer.parseInt(String.valueOf(data_pin.charAt(0)));
            int part_2 = Integer.parseInt(String.valueOf(data_pin.charAt(1)));
            int part_3 = Integer.parseInt(String.valueOf(data_pin.charAt(2)));
            int part_4 = Integer.parseInt(String.valueOf(data_pin.charAt(3)));
            int part_5 = Integer.parseInt(String.valueOf(data_pin.charAt(4)));
            int part_6 = Integer.parseInt(String.valueOf(data_pin.charAt(5)));
            int part_7 = Integer.parseInt(String.valueOf(data_pin.charAt(6)));
            int part_8 = Integer.parseInt(String.valueOf(data_pin.charAt(7)));
            int part_9 = Integer.parseInt(String.valueOf(data_pin.charAt(8)));
            int part_10 = Integer.parseInt(String.valueOf(data_pin.charAt(9)));
            int part_11 = Integer.parseInt(String.valueOf(data_pin.charAt(10)));

            if ((9 * part_1 + 7 * part_2 + 3 * part_3 + 1 * part_4 + 9 * part_5 + 7 * part_6 + 3 * part_7 + 1 * part_8 + 9 * part_9 + 7 * part_10)%10 != part_11)
                ok = false;
        }

        return ok;
    }
}
