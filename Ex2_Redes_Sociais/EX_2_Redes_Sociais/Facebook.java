package EX2_Redes_Sociais;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("*Posta foto no Facebook*");
    }
    
    @Override
    public void postarVideo() {
        System.out.println("*Posta video no Facebook*");
    }
    
    @Override
    public void postarComentario() {
        System.out.println("*Posta comentario no Facebook*");
    }
    
    @Override
    public void compartilhar() {
        System.out.println("*Compartilha no Facebook*");
    }
    
    @Override
    public void fazStreaming() {
        System.out.println("*Faz streaming no Facebook*");
    }
 
}
