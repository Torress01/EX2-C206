package EX2_Redes_Sociais;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("*Curte publicacao*");
    };
}
