class Solution {
    public int lengthOfLastWord(String s) {
        // 1. Önce baştaki ve sondaki gereksiz boşlukları temizle
        s = s.trim();
        
        // 2. Sondan başa doğru git ve ilk boşluğa rastlayana kadar say
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                break; // Boşluğa geldik, kelime bitti
            }
        }
        return length;
    }
}

















































