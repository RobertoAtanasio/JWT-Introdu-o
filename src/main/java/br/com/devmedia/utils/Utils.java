package br.com.devmedia.utils;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Utils {

    public static Key gerarChave() {
        String keyString = "IkRldk1lZGlhIiBhcMOzcyBTSEEtMjU2IGUgRW5jb2RlQmFzZTY0Ow=="; //"DevMedia" após SHA-256 e EncodeBase64;
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "HmacSHA256");
        return key;
    }

    public static Date definirDataDeExpiracao(long tempoEmMinutos) {
        LocalDateTime localDateTime = LocalDateTime.now().plusMinutes(tempoEmMinutos);
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date definirDataDeExpiracaoSegundos(long tempoEmSegundos) {
    	LocalDateTime localDateTime = LocalDateTime.now().plusSeconds(tempoEmSegundos);
    	return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
