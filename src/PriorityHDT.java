
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class PriorityHDT {

    final static String PATH = "pacientes.txt";
    final static String Delim = ",\n\t";


    public static void main(String[] args) throws IOException{
        VectorHeapp<Paciente> vh2 = new VectorHeapp<Paciente>();
        PriorityQueue<Paciente> vh = new PriorityQueue<Paciente>();
        Scanner scan = new Scanner(System.in);
        StringTokenizer tokenizer = new StringTokenizer(getDataFile(), Delim);


////        System.out.println("Aceptando pacientes...\n");
        while(tokenizer.hasMoreTokens()){
            Paciente p = new Paciente(tokenizer.nextToken(), tokenizer.nextToken().trim(), tokenizer.nextToken().charAt(0));
//            System.out.println(p);
            vh.add(p);
            vh2.add(p);
        }

        System.out.println("Getting out one by one");
        int s = vh.size();
        for (int i=0; i < s; i++) {
            System.out.println("\nJFC:");
            System.out.println(vh.remove());
            System.out.println("\nVH 2:");
            System.out.println(vh2.remove());
        }
    }

    private static String getDataFile() throws IOException, FileNotFoundException{

        BufferedReader reader;
        File file;
        String linea, datos = "";
        try{
            if((new File(PATH)).exists()){

                reader = new BufferedReader(new FileReader(PATH));
                while((linea = reader.readLine()) != null){
                    datos += linea + "\t";
                }
                reader.close();
            }
            else{
                System.out.println("El archivo ingresado no fue encontrado.");
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }

        return datos;
    }
}
