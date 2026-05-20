import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> yigin = new Stack<>();

        for (char c : s.toCharArray()) {
            // Eğer açma paranteziyse yığına ekle
            if (c == '(' || c == '[' || c == '{') {
                yigin.push(c);
            } 
            // Eğer kapatma paranteziyse
            else {
                // Eğer yığın boşsa (hiç açılmadan kapatılmışsa) direkt hata ver
                if (yigin.isEmpty()) return false;
                
                char ustteki = yigin.pop();
                
                // Eşleşme kontrolü (En kritik yer burası)
                if (c == ')' && ustteki != '(') return false;
                if (c == ']' && ustteki != '[') return false;
                if (c == '}' && ustteki != '{') return false;
            }
        }
        
        // En son yığın boş olmalı (tüm açılanlar kapandı mı?)
        return yigin.isEmpty();
    }
}





   
   
   
   
   
   
   
   

   
   
   
   
   
   
   
   
   
   
   
   
   


