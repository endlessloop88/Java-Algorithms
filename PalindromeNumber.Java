class Solution {
    public boolean isPalindrome(int x) {
        // Negatif sayılar palindrom olamaz (başındaki eksi yüzünden)
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; // Son basamağı al
            reversed = reversed * 10 + digit; // Yeni sayıya ekle
            x /= 10; // Sayıyı küçült
        }

        return original == reversed;
    }
}