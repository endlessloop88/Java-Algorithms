class Solution {
    public int removeElement(int[] nums, int val) {
        // i: Silinmeyecek elemanların yerleşeceği güvenli indeks (yavaş işa
        int i = 0;
        
        // j: Diziyi baştan sona tarayan hızlı işaretçi
        for (int j = 0; j < nums.length; j++) {
            // Eğer o anki sayı silmek istediğimiz sayı DEĞİLSE
            if (nums[j] != val) {
                nums[i] = nums[j]; // Sayıyı güvenli bölgeye taşı
                i++; // Güvenli bölge sınırını bir artır
            }
        }
        
        // i değeri, dizide kalan eleman sayısını verir
        return i;
    }
}
