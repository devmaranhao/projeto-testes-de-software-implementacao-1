import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorDeRomanosTest2 {

    @Test
    public void converterOSimboloI() {
      // criar a classe que ainda não existe
       ConversorDeRomanos2 conversor = new ConversorDeRomanos2();
       
      // criar a operação que ainda não existe na classe, que recebe o símbolo que será convertido
      int resultadoObtido = conversor.converte("I");
       
      assertEquals(1, resultadoObtido);
    }

    
    @Test
    public void converterOSimboloV() {
      // criar a classe que ainda não existe
       ConversorDeRomanos2 conversor = new ConversorDeRomanos2();
       
      // criar a operação que ainda não existe na classe, que recebe o símbolo que será convertido
      int resultadoObtido = conversor.converte("V");
       
      assertEquals(5, resultadoObtido);
    }
}
