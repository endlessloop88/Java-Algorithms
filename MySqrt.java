class MySqrt {
    public int mySqrt(int x) {
        if (x < 2) return x; // 0 ve 1 için direkt kendisini döndür

        long left = 2;
        int right = x / 2; // Bir sayının karekökü (2'den büyükse) yarısından büyük olamaz

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long num = mid * mid;

            if (num > x) {
                right = (int) mid - 1;
            } else if (num < x) {
                left = mid + 1;
            } else {
                return (int) mid; // Tam kare bulduk!
            }
        }

        return right; // Tam sonuç yoksa aşağı yuvarlanmış hali 'right' olur
    }
}