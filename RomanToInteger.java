class RomanToInteger {
    public int romanToInt(String s) {
        int toplam = 0;
        int oncekiDeger = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int suankiDeger = degerGetir(s.charAt(i));

            if (suankiDeger < oncekiDeger) {
                toplam -= suankiDeger;
            } else {
                toplam += suankiDeger;
            }
            oncekiDeger = suankiDeger;
        }
        return toplam;
    }

    int degerGetir(char harf) {
        switch (harf) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}