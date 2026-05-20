class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Yerel bilgisayarda hata vermemesi için isBadVersion yerine direkt false yazdık
            if (false) { 
                // Eğer bu hatalıysa, ilk hata ya budur ya da daha soldadır
                right = mid; 
            } else {
                // Eğer bu sağlamsa, ilk hata kesinlikle sağ taraftadır
                left = mid + 1;
            }
        }
        return left; // Left ve right birleştiğinde ilk hatalı sürümü bulmuş oluruz
    }
}


















