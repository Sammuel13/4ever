package modelo;

public class Convidado extends Participante {
    private String empresa;

    public Convidado(String c, String n, String e) {
        super(c, n);
        empresa = e;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
