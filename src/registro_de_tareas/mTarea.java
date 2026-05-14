/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_de_tareas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ulera
 */
public class mTarea {
    public void Insertar(String cadenaArticulo) {
        try {
            // Esta linea crea el archivo donde se guarda la informacion
            FileWriter archivo = new FileWriter("lista_tareas.txt", true);
            // Buffer temporal que se encarga de guardar los datos en el archivo
            BufferedWriter buffer = new BufferedWriter(archivo);

            buffer.write(cadenaArticulo);

            buffer.newLine();

            buffer.close();

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

    }
    
    
    
    public ArrayList<String> Consultar() {
        ArrayList<String> listaRegistros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("lista_tareas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");

                String datoBonito = "ID: " + datos[0] + "| Titulo: " + datos[1] + "| Descripcion: " + datos[2] + "| Fecha de Entrega: " + datos[3] + "| Prioridad: " + datos[4] + "| Estado: " + datos[5];

                listaRegistros.add(datoBonito);
            }
        } catch (IOException e) {
            System.out.print("Mensaje de error: " + e.getMessage());
            listaRegistros.add("Error al cargar los datos");
        }

        return listaRegistros;
    }
    
    public void update(String lineActual, String lineaNueva, String archivoOriginal) {
        java.io.File fileOriginal = new java.io.File(archivoOriginal);
        java.io.File fileTemporal = new java.io.File("temporal.txt");

        String lineaLeida;

        try (BufferedReader br = new BufferedReader(new FileReader(fileOriginal));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileTemporal));) {

            while ((lineaLeida = br.readLine()) != null) {
                String[] datosLeidos = lineaLeida.split("\\|");
                String[] datosActuales = lineActual.split("\\|");

                if (datosLeidos.length > 0 && datosActuales.length > 0
                        && datosLeidos[0].trim().equals(datosActuales[0].trim())) {
                    bw.write(lineaNueva);
                    bw.newLine();
                } else {
                    bw.write(lineaLeida);
                    bw.newLine();
                }
            }

        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }

        if (fileOriginal.delete()) {
            fileTemporal.renameTo(fileOriginal);
        } else {
            System.out.println("No se pudo reemplazar el archivo original");
        }
    }
    
        public void eliminarRegistro(String lineActual, String archivoOriginal) {
        java.io.File fileOriginal = new java.io.File(archivoOriginal);
        java.io.File fileTemporal = new java.io.File("temporal.txt");

        String lineaLeida;

        try (BufferedReader br = new BufferedReader(new FileReader(fileOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileTemporal))) {

            while ((lineaLeida = br.readLine()) != null) {
                String[] datosLeidos = lineaLeida.split("\\|");
                String[] datosActuales = lineActual.split("\\|");

                if (!(datosLeidos.length > 0 && datosActuales.length > 0
                        && datosLeidos[0].trim().equals(datosActuales[0].trim()))) {
                    bw.write(lineaLeida);
                    bw.newLine();
                }
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }

        if (fileOriginal.delete()) {
            fileTemporal.renameTo(fileOriginal);
        } else {
            System.out.println("No se pudo reemplazar el archivo original");
        }
    }
}
