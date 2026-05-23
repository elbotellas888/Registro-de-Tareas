package registro_de_tareas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class clsTareas {
    
    private Integer id;
    private String titulo;
    private String descripcion;
    private String entrega; 
    private String prioridad;
    private String estado;
    
    public clsTareas(Integer ID, String titulo, String descripcion, String entrega, String prioridad, String estado) {
        this.id = ID;  
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.entrega = entrega;
        this.prioridad = prioridad; 
        this.estado = estado;
    }    
    
    public String aTexto() {
        return this.id + "|" + this.titulo + "|" + this.descripcion + "|" + this.entrega + "|" + this.prioridad + "|" + this.estado;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

    public void guardar() {
        mTarea tarea = new mTarea();
        String textoTarea = this.aTexto();
        tarea.Insertar(textoTarea);
    }
    
    public DefaultListModel<String> llenarLista(){
        mTarea MTask = new mTarea();
        ArrayList<String> datos = MTask.Consultar();
        DefaultListModel<String> modelLista = new DefaultListModel<>();
        
        for (String registro: datos){
            modelLista.addElement(registro);
        }
        
        return modelLista;
    }
    
    public void actualizar(Integer newID, String newTitulo, String newDescripcion, String newEntrega, String newPrioridad, String newEstado){
        String lineaOriginal = this.id + "|" + this.titulo + "|" + this.descripcion + "|" + this.entrega + "|" + this.prioridad + "|" + this.estado;
        String lineaNueva = newID + "|" + newTitulo + "|" + newDescripcion + "|" + newEntrega + "|" + newPrioridad + "|" + newEstado;
        
        System.out.println("Nuevos valores: " + lineaNueva);
        System.out.println("Valores Originales: " + lineaOriginal);
        
        mTarea mTask = new mTarea();
        mTask.update(lineaOriginal, lineaNueva, "lista_tareas.txt"); 
    }
    
    public void eliminar() {
        String lineaOriginal = this.id + "|" + this.titulo + "|" + this.descripcion + "|" + this.entrega + "|" + this.prioridad + "|" + this.estado;
        mTarea mTask = new mTarea();
        mTask.eliminarRegistro(lineaOriginal, "lista_tareas.txt"); 
    }
}