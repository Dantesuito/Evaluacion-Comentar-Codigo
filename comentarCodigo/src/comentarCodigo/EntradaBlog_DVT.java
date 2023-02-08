package comentarCodigo;

/**
 * @author Daniel Vital Torres
 *
 */

public class EntradaBlog_DVT {

	
	/**
	 * Se crea variable para declarar el separador entre
	 * "ENTRADA DE" y el propio nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * @param Número de entrada
	 * @param Nombre de autor de la entrada
	 * @param El texto que tiene la propia entrada
	 * @throws Si el id de la entrada es negativo, lanza un IllegalArgumentException
	 */
	public EntradaBlog_DVT(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return Devuelve el número de la entrada
	 */
	
	public int getId(){
		return this.id;
	}
	
	/**
	 * @return Devuelve el texto de la entrada
	 */

	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * @return Devuelve el nombre del autor de la entrada
	 */

	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	

	/**
	 * @param Método main con el objeto que contiene los atributos que se van a usar
	 * para hacer el sout final
	 */

	public static void main(String[] args) {

		EntradaBlog_DVT e1=new EntradaBlog_DVT (3,"Daniel","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
