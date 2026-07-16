class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = s.length() - 1;
        for (int i = 0; i < j; i++) {
            if (s.charAt(i) == s.charAt(j)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
