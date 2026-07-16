class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder copy = new StringBuilder(s);
        String reversed = copy.reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == reversed.charAt(i)) {
                // Continue checking
            } else {
                return false;
            }
        }
        return true;
    }
}
