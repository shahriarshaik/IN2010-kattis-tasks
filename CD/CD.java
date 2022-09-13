package CD;

import java.util.Scanner;
import java.io.File;

public class CD {
    public static void main(String[] args) {
        File inputFile = new File("CD/A.0.in");
        String[] CDs;
        int Jack;
        int Jill;
        int same = 0;

        try {
            Scanner inRead = new Scanner(inputFile);
            CDs = inRead.nextLine().split(" ");
            Jack = Integer.parseInt(CDs[0]);
            Jill = Integer.parseInt(CDs[1]);
            String[] jackList = new String[Jack];
            String[] jillList = new String[Jill];
            for (int i = 0; i < Jack; i++) {
                jackList[i] = inRead.nextLine();
            }
            for (int i = 0; i < Jill; i++) {
                jillList[i] = inRead.nextLine();
            }
            for (int i = 0; i < jackList.length; i++) {
                for (int j = 0; j < jillList.length; j++) {
                    if (jackList[i].equals(jillList[j])) {
                        same++;
                    }
                }
            }
            System.out.println(same);

        } catch (Exception e) {
            System.out.println("failed to read ");
        }
    }
}
