package excepciones;

@SuppressWarnings("serial")
public class UsuarioEmailRepetido extends Exception{
	
	public UsuarioEmailRepetido(String string) {
        super(string);
    }
}