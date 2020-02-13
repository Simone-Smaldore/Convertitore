package convertitore.test;

import convertitore.modello.Convertitore;
import java.security.NoSuchAlgorithmException;
import junit.framework.TestCase;


public class TestConvertirore extends TestCase {
    
    public void testConvertitore() {
        try {           
            assertEquals(Convertitore.getConversioneSHA("ciao"), "b133a0c0e9bee3be20163d2ad31d6248db292aa6dcb1ee087a2aa50e0fc75ae2");
            assertEquals(Convertitore.getConversioneSHA("123456"), "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92");
        } catch (NoSuchAlgorithmException ex) {
            fail();
        }
    }
}
