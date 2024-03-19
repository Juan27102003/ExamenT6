import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.*;

public class P2AlmacenaDatos {

    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("marcas.dat");
        try (RandomAccessFile raf=new RandomAccessFile(f,"rw")){
            Scanner sc=new Scanner(System.in);
            int dia;
            double marca;
            do {
                System.out.println("Dia:");
                dia= sc.nextInt();

                if (dia>0&&dia<6){
                 marca= sc.nextDouble();
                }else System.out.println("Dia icorrecto");
            }while (dia!=0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}