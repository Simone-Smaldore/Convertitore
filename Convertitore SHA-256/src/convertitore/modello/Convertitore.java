package convertitore.modello;

import java.security.NoSuchAlgorithmException;

public class Convertitore {
    
    public static String getConversioneSHA(String originale) throws NoSuchAlgorithmException {
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(originale);
    }
    
}
