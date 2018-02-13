import java.util.Scanner;

public class Main {
    public static void main(String Args[]){
        Scanner hexConv = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String Hex = hexConv.next();
        if(Hex.length() >= 2 && Hex.substring(0,2).equals("0x")) {
            Hex = Hex.substring(2);

        }
        long decimal = 0;
        for (int i=0; i < Hex.length(); i++){
            int value;
            if (Hex.substring(i,i + 1).equals("A") || Hex.substring(i,i + 1).equals("a")){
                value = 10;
            }
            else if (Hex.substring(i,i + 1).equals("B") || Hex.substring(i,i + 1).equals("b")){
                value = 11;
            }
            else if (Hex.substring(i,i + 1).equals("C") || Hex.substring(i,i + 1).equals("c")) {
                value = 12;
            }
            else if (Hex.substring(i,i + 1).equals("D") || Hex.substring(i,i + 1).equals("d")) {
                value = 13;
            }
            else if (Hex.substring(i,i + 1).equals("E") || Hex.substring(i,i + 1).equals("e")) {
                value = 14;
            }
            else if (Hex.substring(i,i + 1).equals("F") || Hex.substring(i,i + 1).equals("f")) {
                value = 15;
            }
            else {
                value = Integer.parseInt(Hex.substring(i,i + 1));
            }
            decimal += value * Math.pow(16, Hex.length() - i - 1);
        }
        System.out.println("Your number is " + decimal + " in decimal");



    }
}







