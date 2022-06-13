package Principal;

public class Orden {

    private String codigo;
    private int numOrden;

    public Orden(){
    }

    public Orden(String codigo, int numOrden){
        this.codigo=codigo;
        this.numOrden=numOrden;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numOrden;
    }
    public void setNumero(int numOrden) {
        this.numOrden = numOrden;
    }
}
