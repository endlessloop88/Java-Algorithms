class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Yavaş işaretçi: Değişmeyecek sayıları buraya toplayacağız

        for (int j = 0; j < nums.length; j++) {
            // Eğer baktığımız sayı (nums[j]), silinmesi gereken sayıya (val) eşit DEĞİLSE
            if (nums[j] != val) {
                nums[i] = nums[j]; // Bu sayıyı dizinin başına, i'nin olduğu yere taşı
                i++; // Bir sonraki "güvenli" yer için i'yi ilerlet
            }
        }

        // i değeri, dizide kalan (silinmemiş) eleman sayısını verir
        return i;
    }
}