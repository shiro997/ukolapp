package co.edu.konradlorenz.ukolapp;

public class Task {

    private String nombreTarea;
    private String fechaTarea;
    private int thumbnailTarea;

    public Task() {}

    public Task(String nombreTarea, String fechaTarea, int thumbnailTarea) {
        this.nombreTarea = nombreTarea;
        this.fechaTarea = fechaTarea;
        this.thumbnailTarea = thumbnailTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(String fechaTarea) {
        this.fechaTarea = fechaTarea;
    }

    public int getThumbnailTarea() {
        return thumbnailTarea;
    }

    public void setThumbnailTarea(int thumbnailTarea) {
        this.thumbnailTarea = thumbnailTarea;
    }
}