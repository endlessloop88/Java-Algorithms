import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Sayıları ve indekslerini hızlıca hatırlamak için bir hafıza (Map) kuruyoruz
        Map<Integer, Integer> hafiza = new HashMap<>();
        
        // Dizideki her bir sayıyı sırayla geziyoruz
        for (int i = 0; i < nums.length; i++) {
            int suankiSayi = nums[i];
            int gerekenSayi = target - suankiSayi;
            
            // Eğer aradığımız sayı hafızada varsa, indeksleri hemen döndür
            if (hafiza.containsKey(gerekenSayi)) {
                return new int[] { hafiza.get(gerekenSayi), i };
            }
            
            // Yoksa, bu sayıyı ve indeksini hafızaya kaydet ki sonrakiler ararsa bulsun
            hafiza.put(suankiSayi, i);
        }
        
        // Java'nın derleme hatası vermemesi için zorunlu boş dönüş hattı
        return new int[] {};
    }
}