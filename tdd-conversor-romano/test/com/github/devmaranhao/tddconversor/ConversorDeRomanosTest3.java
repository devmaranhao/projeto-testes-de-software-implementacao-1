import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorDeRomanosTest3 {

    @Test
    public void converterOSimboloI() {
       // criar a classe que ainda não existe
       ConversorDeRomanos3 conversor = new ConversorDeRomanos3();
       
       // criar a operação que ainda não existe na classe, que recebe o símbolo que será convertido
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    
    @Test
    public void converterOSimboloV() {
       // criar a classe que ainda não existe
       ConversorDeRomanos3 conversor = new ConversorDeRomanos3();
       
       // criar a operação que ainda não existe na classe, que recebe o símbolo que será convertido
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       // criar a classe que ainda não existe
       ConversorDeRomanos3 conversor = new ConversorDeRomanos3();
       
       // criar a operação que ainda não existe na classe, que recebe o símbolo que será convertido
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
}
