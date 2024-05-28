package moduloDois;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FatorialDinamico {

	
	private static final Map<Long, BigInteger> elemFat = new HashMap<>();

    public static BigInteger fatorialDinamica(long numFatorial) {
        // Inicializa o mapa com o valor base
        elemFat.put(0L, BigInteger.ONE);
        return fatorialDinamicaAux(numFatorial);
    }

    private static BigInteger fatorialDinamicaAux(long numFatorial) {
        if (elemFat.containsKey(numFatorial)) {
            return elemFat.get(numFatorial);
        } else {
            BigInteger fat = BigInteger.valueOf(numFatorial).multiply(fatorialDinamicaAux(numFatorial - 1));
            elemFat.put(numFatorial, fat);
            return fat;
        }
    }
	
	
}
