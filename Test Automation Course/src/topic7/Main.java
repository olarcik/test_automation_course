package topic7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileManager file = new FileManager();

        file.scriereaInformatieTextInFisier("C:/tools/java.txt","Hello, my name is RobotOne!!!");
        file.alipireaInformatieiLaFisier("C:/tools/java.txt","\nHello, my name is RobotTwo!!!");
        file.citireDateDinFisier("C:/tools/java.txt");


    }
}
