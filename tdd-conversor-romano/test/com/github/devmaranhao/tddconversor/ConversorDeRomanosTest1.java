import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorDeRomanosTest1 {

    @Test
    public void converterOSimboloI() {
       // criar a classe que ainda não existe
       ConversorDeRomanos1 conversor = new ConversorDeRomanos1();
       
       // criar a operação que ainda não existe na classe, que recebe o símbolo que será convertido
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

}
