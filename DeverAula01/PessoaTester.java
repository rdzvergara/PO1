public class PessoaTester {
    
    public static void main(String[] args){
       //Pessoa pessoa = new Pessoa("Rodrigo Luiz");
       
       //pessoa.setNome("Rodrigo Luiz");
       //pessoa.fazerAniversario();

       /*Aluno aluno= new Aluno();
       aluno.setNome("Rodrigo Luiz");
       aluno.fazerAniversario();*/

       Funcionario func= new Funcionario();
       func.setNome("Rodrigo");
       func.setSetor("Administração");
       func.setTrabalhando(true);
       func.mudarTrabalho("TI");
       func.fazerAniversario();
    }
}
