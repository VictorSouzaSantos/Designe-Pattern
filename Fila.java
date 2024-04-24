package Entidades;

/*
1)	O Singleton.
2)	Resolve problemas comuns em códigos.
3)	Inicialização preguiçosa, utilizando o objeto apenas na primeira vez que for necessário
*/

public class Fila {
	
	private static Fila Instance; 
	

	public static Fila getInstance() {
		
		if (Instance == null) {
			Instance = new Fila();
			
		}
		
		return Instance;
	}
	
	public void ImprimeDocumentos() {
		
		System.out.println();
		
	}
	
	public void RemoveDocumento() {	
	}
	
	public void RemoveTodosDocumentos() {
	}
	
	private Fila() {
	}

}
