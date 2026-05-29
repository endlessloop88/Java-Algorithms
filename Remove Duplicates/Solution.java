class Solution {
    public int removeDuplicates(int[] nums) {
        // Eğer dizi boşsa eleman sayısı zaten 0'dır
        if (nums.length == 0) return 0;
        
        // i: Benzersiz elemanların yerleşeceği yavaş işaretçi
        int i = 0;
        
        // j: Diziyi baştan sona tarayan hızlı işaretçi (kaşif)
        for (int j = 1; j < nums.length; j++) {
            // Eğer yeni ve farklı bir sayı bulursak
            if (nums[j] != nums[i]) {
                i++; // Güvenli bölge sınırını bir adım ileri kaydır
                nums[i] = nums[j]; // Yeni benzersiz sayıyı o sınıra kopyala
            }
        }
        
        // Benzersiz eleman sayısı, en son kalınan indeksin 1 fazlasıdır
        return i + 1;
    }
}
