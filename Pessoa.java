abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract String enviarEmail(String corpoMensagem);
}

class Professor extends Pessoa {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public String enviarEmail(String corpoMensagem) {
        return "Olá Prof. " + nome + "!\n\n" + corpoMensagem;
    }
}

class Aluno extends Pessoa {
    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public String enviarEmail(String corpoMensagem) {
        return "Olá Aluno " + nome + "!\n\n" + corpoMensagem;
    }
}

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Alan Turing");
        Aluno aluno = new Aluno("Joseph");

        String corpoMensagem = "Esta é uma mensagem de teste.";

        System.out.println(prof.enviarEmail(corpoMensagem));
        System.out.println(aluno.enviarEmail(corpoMensagem));
    }
}
