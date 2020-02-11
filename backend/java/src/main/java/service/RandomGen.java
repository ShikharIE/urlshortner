package service;

import org.springframework.stereotype.Service;

@Service
public class RandomGen {

    public String generateUrl(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"
                + "+/";
        StringBuilder s = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            s.append(AlphaNumericString.charAt(index));
        }
        return s.toString();
    }
}
