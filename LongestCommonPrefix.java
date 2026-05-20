class LongestCommonPrefix {
public String longestCommonPrefix(String[] strs) {
        // Eğer dizi boşsa direkt boş string döndür
        if (strs == null || strs.length == 0) return "";
        
        // İlk kelimeyi başlangıç öneki olarak seçiyoruz
        String prefix = strs[0];
        
        // Dizideki diğer kelimeleri sırayla kontrol ediyoruz
        for (int i = 1; i < strs.length; i++) {
            // strs[i] kelimesi prefix ile başlayana kadar prefix'i arkadan kırpıyoruz
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // Eğer prefix tamamen tükenirse ortak önek yok demektir
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}