package dnd5e;

import java.util.Scanner;

public class Driver5e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CharacterCreator c = new CharacterCreator(in);

        Player pc;
        pc = c.creator();

        System.out.println(pc.getName());
    }
}
