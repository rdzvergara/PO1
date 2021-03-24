public class Funcionario extends Pessoa {
    private String setor;
    private Boolean trabalhando;

    public Funcionario(String setor,Boolean trabalhando){
        this.trabalhando= trabalhando;
        this.setor= setor;
    }
    public Funcionario(){
    
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(String string){
        this.setor= string;
        System.out.println("Mudou de trabalho!");
    }
}
