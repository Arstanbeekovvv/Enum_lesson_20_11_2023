package HomeWork_From_PRESENTATION;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("(-)❌" +
                ",   (_)✅" +
                "\nWrite region: ");
        String region = new Scanner(System.in).nextLine();
        for (OBLKyrgyz value : OBLKyrgyz.values()) {
            if(value.name().equalsIgnoreCase(region)){
                value.infoRegion();
            }
        }
    }
}
