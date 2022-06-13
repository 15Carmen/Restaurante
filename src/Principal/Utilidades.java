package Principal;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Utilidades {

    public static void escribirMenu(){

        Plato plato1 =new Plato("111","Pizza maragarita",5);
        Plato plato2 =new Plato("222", "Macarrones con queso", 7.5);
        Plato plato3 =new Plato("333","Lasagna",8);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Platos.txt"))){

            //Escribimos el menu
            bw.write(plato1.getCodigo()+",");
            bw.write(plato1.getNombre()+",");
            bw.write(plato1.getPrecio()+"");
            bw.newLine();
            bw.write(plato2.getCodigo()+",");
            bw.write(plato2.getNombre()+",");
            bw.write(plato2.getPrecio()+"");
            bw.newLine();
            bw.write(plato3.getCodigo()+",");
            bw.write(plato3.getNombre()+",");
            bw.write(plato3.getPrecio()+"");

        } catch (IOException e) {
            System.out.println("Archivo no encontado "+ e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Platos.txt"))) {

            String linea;

            System.out.println("Estas son las opciones que tenemos de menu:\n");
            while ( (linea = br.readLine()) != null ){
                System.out.println(linea); //mostramos
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error general! "+e.getMessage());
        }



    }

}
