class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        // Arama penceresi kapanana kadar dön
        while (low <= high) {
            // Büyük dizilerde taşma (overflow) olmasın diye orta noktayı böyle buluyoruz
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                return mid; // Hedef bulundu!
            } else if (nums[mid] > target) {
                high = mid - 1; // Sol yarıya bak
            } else {
                low = mid + 1;  // Sağ yarıya bak
            }
        }
        
        // Eğer hedef bulunamadıysa, low tam olarak eklenmesi gereken indeksi gösterir
        return low;
    }
}
