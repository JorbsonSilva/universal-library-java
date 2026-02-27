package exercicios.HerancaPolimorfismo;

public class Sistema {
    private String nome;
    private String email;
    private String senha;
    private boolean admin;
    private boolean login;

    public Sistema (String nome, String email, String senha, boolean admin){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
        this.login = false;
    }

    public String getLogin(){
        if (login == true){
            return "Você está conectado!!!";
        } else {
            return "Faça login!!!";
        }
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public Boolean getAdmin(){
        return admin;
    }

    public String realizarLogin(String senha){
        if (this.senha.equals(senha)){
            this.login = true;
            return "Você foi conectado.";
        }else{
            return "Senha incorreta.";
        }
    }

    public boolean realizarLogoff(){
        return this.login = false;
    }

    public String alterarDados(String nome){
        this.nome = nome;
        return "Seu nome foi alterado.";
    }

    public String alterarSenha(String senhaAtual, String novaSenha){
        if(this.senha.equals(senhaAtual)){
            this.senha = novaSenha;
            return "Sua senha foi alterada.";
        } else {
            return "Senha atual incorreta.";
        }
    }

}
