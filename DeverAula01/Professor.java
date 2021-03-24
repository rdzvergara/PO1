public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String especialidade,float salario){
        this.especialidade= especialidade;
        this.salario= salario;
    }
    public Professor(){
        
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void receberAum(Float aum){
        this.salario += aum;
    }
    
}
