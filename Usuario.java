import java.util.ArrayList;

abstract class Usuario {

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static ArrayList<Usuario> getListaUsers() {
        return listaUsuarios;
    }

    private String nome;
    private String email;
    private String profissao;

    public Usuario(String nome, String email, String profissao) {
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Profissão: " + profissao;
    }
}

class Professor extends Usuario {
    public Professor(String nome, String email) {
        super(nome, email, "Professor");
    }
}

class Coordenador extends Usuario {
    public Coordenador(String nome, String email) {
        super(nome, email, "Coordenador");
    }
}

class Diretor extends Usuario {
    public Diretor(String nome, String email) {
        super(nome, email, "Diretor");
    }
}
