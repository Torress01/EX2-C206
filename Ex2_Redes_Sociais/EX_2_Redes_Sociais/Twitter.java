package EX2_Redes_Sociais;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("*Posta foto no Twitter*");
    }
    
    @Override
    public void postarVideo() {
        System.out.println("*Posta video no Twitter*");
    }
    
    @Override
    public void postarComentario() {
        System.out.println("*Posta comentario no Twitter*");
    }
    
    @Override
    public void compartilhar() {
        System.out.println("*Compartilha no Twitter*");
    }
 
}
