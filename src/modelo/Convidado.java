package modelo;

//obrigatório
public class Convidado extends Participante {
    private String empresa;

    public Convidado(String cpf, String datNasc, String emp) {
        super(cpf, datNasc);
        empresa = emp;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
