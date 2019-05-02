
import java.security.*;

public class crip1 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
	String cifrado= "esp mpde cplnetzy ez \"estd td nzyqfdtyr, hspcp lcp esp oznd\" td ez cphctep esp qplefcp ez xlvp te wpdd nzyqfdtyr, yze hctep xzcp oznd. upqq lehzzo";
		
		//System.out.println(sha1(cifrado));
		System.out.println(decriptar(11,"estd td nzyqfdtyr, hspcp lcp esp oznd"));
	 

}
	static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }
	 public static String decriptar(int chave, String textoCifrado){
	      // Variavel que ira guardar o texto decifrado
	      StringBuilder texto = new StringBuilder();
	      // Variavel com tamanho do texto a ser decriptado
	      int tamanhoTexto = textoCifrado.length();
	      
	      // Descriptografa cada caracter por vez
	      for(int c=0; c < tamanhoTexto; c++){
	         // Transforma o caracter em codigo ASCII e faz a descriptografia
	         int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;
	         
	         // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
	         while(letraDecifradaASCII < 32)
	            letraDecifradaASCII += 94;

	         // Transforma codigo ASCII descriptografado em caracter ao novo texto
	         texto.append( (char)letraDecifradaASCII );
	      }
	      
	      // Por fim retorna a mensagem descriptografada por completo
	      return texto.toString();
	   }

}
	  
