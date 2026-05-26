class Solution {
    public boolean isPalindrome(String s) {
        // İki işaretçimizi cümlenin iki ucuna yerleştiriyoruz
        int sol = 0;
        int sag = s.length() - 1;
        
        while (sol < sag) {
            char solKarakter = s.charAt(sol);
            char sagKarakter = s.charAt(sag);
            
            // Sol işaretçi harf veya sayı değilse, es geç ve sağa kaydır
            if (!Character.isLetterOrDigit(solKarakter)) {
                sol++;
            } 
            // Sağ işaretçi harf veya sayı değilse, es geç ve sola kaydır
            else if (!Character.isLetterOrDigit(sagKarakter)) {
                sag--;
            } 
            // İkisi de geçerli karakterse, küçük harfe çevirip karşılaştır
            else {
                if (Character.toLowerCase(solKarakter) != Character.toLowerCase(sagKarakter)) {
                    return false; // En ufak bir uyumsuzlukta elendi!
                }
                // Karakterler aynıysa işaretçileri içeri doğru yürüt
                sol++;
                sag--;
            }
        }
        
        // Eğer döngü başarıyla bittiyse metnimiz palindromdur
        return true;
    }
}