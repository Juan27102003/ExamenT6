import java.io.*;
import java.util.Arrays;


public class P1CalculaLLuvia {
    public static void main(String[] args) throws IOException {
      try {
          BufferedReader br= new BufferedReader(new FileReader("lluvia.txt"));
          int lluviaMin= Integer.parseInt(br.readLine());
          String mes,r;
          int suma=0;
          int lluvia;
          do {
              mes = br.readLine();
          } while (mes != null);

          BufferedWriter bw=new BufferedWriter(new FileWriter("salida.txt"));
          if (suma>=lluviaMin){
              bw.write(mes);
              bw.write(suma);
          }
      } catch (NumberFormatException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }

    }
}
