import java.util.Scanner;
public class Aluno{
    private Integer matricula;
    private String nome;
    private String curso;
    Scanner input= new Scanner(System.in);
    public Aluno(){
        System.out.printf("Nome do Aluno: ");
        this.nome= input.next();
        System.out.printf("Matricula: ");
        this.matricula= input.nextInt();
        System.out.printf("Curso: ");
        this.curso= input.next();
        if (curso.trim().equals(curso)==curso.trim().equals("SI")|| curso.trim().equals(curso)==curso.trim().equals("si")) {
            this.curso= "Sistemas de Informação";
        }
    }

    public void listar(){
        System.out.printf(this.nome + ",aluno de " + this.curso + "\nMatricula: "+ this.matricula);
    }
    }
