/**
 * Leetcode
 * problem: 1297
 * link: https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/
 * tag: Sliding Window
 */

/**
 * Success:
 * 32 ms
 * Beats 88.22%
 */
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();
        int result = 0;
        int left = 0, right = minSize;

        while (right <= s.length()) {
            String letter = s.substring(left, right);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
            left++;
            right++;
        }

        for (String letter : map.keySet()) {
            int count = map.get(letter);

            if (count > result && isValid(letter, maxLetters)) {
                result = count;
            }
        }
        return result;
    }

    private boolean isValid(String letter, int maxLetters) {
        Set<Character> checker = new HashSet<>();
        for (int i = 0; i < letter.length(); i++) {
            char c = letter.charAt(i);
            checker.add(c);
        }
        return checker.size() <= maxLetters;
    }
}