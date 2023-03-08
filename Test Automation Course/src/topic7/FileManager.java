package topic7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileManager {



    public void scriereaInformatieTextInFisier(String caleaCatreFisiser,String date) throws IOException {

        try (FileWriter fileWriter = new FileWriter(caleaCatreFisiser)){

            fileWriter.write(date);
            System.out.println("Datele au fost inregistrate cu succes!");

        } catch (FileNotFoundException e) {

            System.out.println("Calea catre fisier este indicata gresit!!!" + e);

        }

    }

    public void alipireaInformatieiLaFisier(String caleaCatreFisiser,String date) throws IOException {

        try (FileWriter fileWriter = new FileWriter(caleaCatreFisiser,true)) {

            fileWriter.append(date);
            System.out.println("Datele au fost inregistrate cu succes!");

        } catch (FileNotFoundException e){

            System.out.println("Calea catre fisier este indicata gresit!!!" + e);

        }
    }

    public void citireDateDinFisier(String caleaCatreFisiser) throws IOException {

        char array[] = new char[100];

        try {

            FileReader input = new FileReader(caleaCatreFisiser);

            input.read(array);
            System.out.println("Date inregistrate: ");
            System.out.println(array);

            input.close();

        } catch (FileNotFoundException e) {

            System.out.println("Calea catre fisier este indicata gresit!!!" + e);

        }

    }

}
